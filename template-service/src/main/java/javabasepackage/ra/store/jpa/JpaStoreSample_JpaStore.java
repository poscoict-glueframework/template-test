package javabasepackage.ra.store.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javabasepackage.domain.entity.DomainEntitySample;
import javabasepackage.domain.store.JpaStoreSample_Store;
import javabasepackage.ra.store.jpa.jpo.JpaStoreSample_Jpo;
import javabasepackage.ra.store.jpa.repository.JpaStoreSample_Repository;

@Repository
public class JpaStoreSample_JpaStore implements JpaStoreSample_Store {
	@Autowired
	JpaStoreSample_Repository repository;

	@Override
	public void create(DomainEntitySample entity) {
		repository.save(new JpaStoreSample_Jpo(entity));
	}

	@Override
	public DomainEntitySample retrieve(String id) {
		Optional<JpaStoreSample_Jpo> value = repository.findById(id);
		return value.get().toDomain();
	}

	@Override
	public List<DomainEntitySample> retrieveByCondition(String condition) {
		return JpaStoreSample_Jpo.toDomains(repository.findByCondition(condition));
	}

	@Override
	public List<DomainEntitySample> retrieveAll() {
		return JpaStoreSample_Jpo.toDomains(repository.findAll());
	}

	@Override
	public void update(DomainEntitySample entity) {
		if (!repository.existsById(entity.getId())) {
			throw new RuntimeException("No Data");
		}
		Optional<JpaStoreSample_Jpo> value = repository.findById(entity.getId());
		JpaStoreSample_Jpo jpo = value.get();
		jpo.update(entity);
		repository.save(jpo);
	}

	@Override
	public void delete(String id) {
		if ( repository.existsById(id) ) {
			repository.deleteById(id);
		}
	}
}

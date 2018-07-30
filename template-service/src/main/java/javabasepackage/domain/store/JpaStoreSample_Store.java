package javabasepackage.domain.store;

import java.util.List;

import javabasepackage.domain.entity.DomainEntitySample;

public interface JpaStoreSample_Store {
	void create(DomainEntitySample entity);
	DomainEntitySample retrieve(String id);
	List<DomainEntitySample> retrieveByCondition(String condition);
	List<DomainEntitySample> retrieveAll();
	void update(DomainEntitySample entity);
	void delete(String id);
}

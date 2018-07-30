package javabasepackage.ra.store.jpa.jpo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import javabasepackage.domain.entity.DomainEntitySample;

@Entity(name = "JpaStoreSample")
@Table(name = "TB_JPA_STORE_SAMPLE")
public class JpaStoreSample_Jpo {
	@Id
	private String id;
	private String condition;
	private String attr1;
	private String attr2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	@SuppressWarnings("unused")
	private JpaStoreSample_Jpo() {
	}

	public JpaStoreSample_Jpo(DomainEntitySample entity) {
		update(entity);
	}

	public void update(DomainEntitySample entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public DomainEntitySample toDomain() {
		DomainEntitySample entity = new DomainEntitySample(this.getId());
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	public static List<DomainEntitySample> toDomains(Iterable<JpaStoreSample_Jpo> jpos) {
		return StreamSupport.stream(jpos.spliterator(), false).map(JpaStoreSample_Jpo::toDomain)
				.collect(Collectors.toList());
	}
}

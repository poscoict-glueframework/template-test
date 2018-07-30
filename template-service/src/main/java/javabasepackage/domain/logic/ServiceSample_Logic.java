package javabasepackage.domain.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javabasepackage.domain.NameValueList;
import javabasepackage.domain.entity.DomainEntitySample;
import javabasepackage.domain.spec.ServiceSample_Service;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Cdo;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Rdo;
import javabasepackage.domain.store.JpaStoreSample_Store;

@Service
public class ServiceSample_Logic implements ServiceSample_Service {
	@Autowired
	JpaStoreSample_Store store;

	@Override
	public List<DomainEntitySample> findList() {
		return store.retrieveAll();
	}

	@Override
	public List<DomainEntitySample> findByCondition(String condition) {
		return store.retrieveByCondition(condition);
	}

	@Override
	public DomainEntitySample findDomainEntity(String entityId) {
		return store.retrieve(entityId);
	}

	@Override
	public void registerDomainEntity(ServiceDataObjectSample_Cdo cdo) {
		DomainEntitySample entity = DomainEntitySample.fromJson(cdo.toJson());
		store.create(entity);
	}

	@Override
	public void modifyDomainEntity(String id, NameValueList nameValues) {
		DomainEntitySample entity = store.retrieve(id);
		entity.setAttr1(nameValues.getValueOf("attr1"));
		entity.setAttr2(nameValues.getValueOf("attr2"));
		store.update(entity);
	}

	@Override
	public void modifyDomainEntity(String id, ServiceDataObjectSample_Cdo cdo) {
		DomainEntitySample entity = store.retrieve(id);
		entity.setCondition(cdo.getCondition());
		entity.setAttr1(cdo.getAttr1());
		entity.setAttr2(cdo.getAttr2());
		store.update(entity);
	}

	@Override
	public void removeDomainEntity(String id) {
		store.delete(id);
	}

	@Override
	public void checkDomainEntity(ServiceDataObjectSample_Rdo rdo) {
	}
}

package javabasepackage.domain.spec;

import java.util.List;

import javabasepackage.domain.NameValueList;
import javabasepackage.domain.entity.DomainEntitySample;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Cdo;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Rdo;

public interface ServiceSample_Service {
	// 전체 조회
	List<DomainEntitySample> findList();

	// 일부 조회
	List<DomainEntitySample> findByCondition(String condition);

	// ID로 조회
	DomainEntitySample findDomainEntity(String entityId);

	// 등록/생성 
	void registerDomainEntity(ServiceDataObjectSample_Cdo cdo);

	// 수정 
	void modifyDomainEntity(String entityId, ServiceDataObjectSample_Cdo cdo);

	// 수정 
	void modifyDomainEntity(String entityId, NameValueList nameValues);

	// 삭제
	void removeDomainEntity(String entityId);

	// 기타
	void checkDomainEntity(ServiceDataObjectSample_Rdo rdo);
}

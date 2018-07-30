package javabasepackage.adapter.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javabasepackage.adapter.sdo.AdapterSample_DTO;
import javabasepackage.adapter.spec.AdapterSample_Adapter;
import javabasepackage.domain.logic.ServiceSample_Logic;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Cdo;

@Service
public class AdaperSample_AdapterLogic implements AdapterSample_Adapter {
	@Autowired
	private ServiceSample_Logic logic;

	@Override
	public String register(AdapterSample_DTO dto) {
		ServiceDataObjectSample_Cdo cdo = ServiceDataObjectSample_Cdo.fromJson(dto.toJson());
		cdo.setCondition("from proxy");
		logic.registerDomainEntity(cdo);
		return "add ok";
	}

}

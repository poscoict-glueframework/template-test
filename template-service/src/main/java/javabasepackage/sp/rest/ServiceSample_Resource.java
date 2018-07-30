package javabasepackage.sp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javabasepackage.domain.NameValueList;
import javabasepackage.domain.entity.DomainEntitySample;
import javabasepackage.domain.logic.ServiceSample_Logic;
import javabasepackage.domain.spec.ServiceSample_Service;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Cdo;
import javabasepackage.domain.spec.sdo.ServiceDataObjectSample_Rdo;

@RestController
@RequestMapping("template")
public class ServiceSample_Resource implements ServiceSample_Service {
	@Autowired
	private ServiceSample_Logic logic;

	/**
	 * http://localhost:8080/template/
	 * curl -X GET http://localhost:8080/template -H "Content-Type: application/json; charset=utf-8"
	 */
	@Override
	@GetMapping
	public List<DomainEntitySample> findList() {
		return logic.findList();
	}

	/**
	 * http://localhost:8080/template/?condition=yujin
	 * curl -X GET http://localhost:8080/template -d '{"condition":"yujin"}' -H "Content-Type: application/json; charset=utf-8"
	 */
	@Override
	@GetMapping(params = { "condition" })
	public List<DomainEntitySample> findByCondition(@RequestParam String condition) {
		return logic.findByCondition(condition);
	}

	/**
	 * curl -X POST http://localhost:8080/template -d '{"condition":"yujin", "attr1":"2", "attr2":"2"}' -H "Content-Type: application/json; charset=utf-8"
	 */
	@Override
	@PostMapping
	public void registerDomainEntity(@RequestBody ServiceDataObjectSample_Cdo cdo) {
		logic.registerDomainEntity(cdo);
	}

	/**
	 * http://localhost:8080/template/8d2fa0eb-93c1-11e8-8a10-adb23dcb34da
	 */
	@Override
	@GetMapping("{id}")
	public DomainEntitySample findDomainEntity(@PathVariable String id) {
		return logic.findDomainEntity(id);
	}

	/**
	 * curl -X PUT http://localhost:8080/template/8d2fa0eb-93c1-11e8-8a10-adb23dcb34da -d '{"condition":"yujin", "attr1":"11", "attr2":"12"}' -H "Content-Type: application/json; charset=utf-8"
	 */
	@Override
	@PutMapping("{id}")
	public void modifyDomainEntity(@PathVariable String id, @RequestBody ServiceDataObjectSample_Cdo cdo) {
		logic.modifyDomainEntity(id, cdo);
	}

	/**
	 * curl -X DELETE http://localhost:8080/template/8d2fa0eb-93c1-11e8-8a10-adb23dcb34da -H "Content-Type: application/json; charset=utf-8"
	 */
	@Override
	@DeleteMapping("{id}")
	public void removeDomainEntity(@PathVariable String id) {
		logic.removeDomainEntity(id);
	}

	@Override
	public void modifyDomainEntity(String entityId, NameValueList nameValues) {
		logic.modifyDomainEntity(entityId, nameValues);
	}

	@Override
	public void checkDomainEntity(ServiceDataObjectSample_Rdo rdo) {
		logic.checkDomainEntity(rdo);
	}
}

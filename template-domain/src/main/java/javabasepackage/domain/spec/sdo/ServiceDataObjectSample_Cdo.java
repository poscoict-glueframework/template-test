package javabasepackage.domain.spec.sdo;

import javabasepackage.domain.JsonSerializable;
import javabasepackage.domain.JsonUtil;

public class ServiceDataObjectSample_Cdo implements JsonSerializable {
	private String entityId;
	private String condition;
	private String attr1;
	private String attr2;

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
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

	public static ServiceDataObjectSample_Cdo fromJson(String json) {
		return JsonUtil.fromJson(json, ServiceDataObjectSample_Cdo.class);
	}
}

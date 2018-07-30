package javabasepackage.adapter.sdo;

import javabasepackage.adapter.JsonSerializable;
import javabasepackage.adapter.JsonUtil;

public class AdapterSample_DTO implements JsonSerializable {
	public static AdapterSample_DTO fromJson(String json) {
		return JsonUtil.fromJson(json, AdapterSample_DTO.class);
	}

	private String attr1;
	private String attr2;

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
}

package javabasepackage.domain.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.uuid.Generators;

import javabasepackage.domain.JsonSerializable;
import javabasepackage.domain.JsonUtil;

@MappedSuperclass
public class DomainEntitySample implements Serializable, JsonSerializable {
	private static final long serialVersionUID = 1L;
	// 공통 : ID는 자동 생성될 수 있도록 함. DB 설계기준 확인 필요할듯 함.
	@Id
	private final String id;

	public DomainEntitySample() {
		this.id = Generators.timeBasedGenerator().generate().toString();
	}

	public DomainEntitySample(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	// 공통 : util성
	public static DomainEntitySample fromJson(String json) {
		return JsonUtil.fromJson(json, DomainEntitySample.class);
	}

	// TOOD : 여기서부터 개발자가 직접 추가할 항목과 getter/setter 들임.
	private String condition;
	private String attr1;
	private String attr2;

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
}

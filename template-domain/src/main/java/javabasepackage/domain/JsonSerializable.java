package javabasepackage.domain;

public interface JsonSerializable {
	default String toJson() {
		return JsonUtil.toJson(this);
	}
}

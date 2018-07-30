package javabasepackage.adapter;

public interface JsonSerializable {
	default String toJson() {
		return JsonUtil.toJson(this);
	}
}

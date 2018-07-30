package javabasepackage.domain.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.uuid.Generators;

import javabasepackage.domain.JsonSerializable;
import javabasepackage.domain.JsonUtil;

@MappedSuperclass
public class KafkaProducerSample_Event implements Serializable, JsonSerializable {
	private static final long serialVersionUID = 1L;
	@Id
	private final String id;

	public KafkaProducerSample_Event() {
		this.id = Generators.timeBasedGenerator().generate().toString();
	}

	public KafkaProducerSample_Event(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public static KafkaProducerSample_Event fromJson(String json) {
		return JsonUtil.fromJson(json, KafkaProducerSample_Event.class);
	}
}

package javabasepackage.adapter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javabasepackage.adapter.logic.AdaperSample_AdapterLogic;
import javabasepackage.adapter.sdo.AdapterSample_DTO;
import javabasepackage.adapter.spec.AdapterSample_Adapter;

@RestController
@RequestMapping("adapter/template")
public class AdapterSample_AdapterResource implements AdapterSample_Adapter {
	@Autowired
	private AdaperSample_AdapterLogic logic;
	
	@Override
	@PostMapping("proxy")
	public String register(@RequestBody AdapterSample_DTO dto) {
		return logic.register(dto);
	}
}

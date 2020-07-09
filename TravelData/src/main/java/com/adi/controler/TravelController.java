package com.adi.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adi.service.ITravelService;

@RestController
@RequestMapping("/travel")
public class TravelController {
	
	@Autowired
	private ITravelService trvl;
	
	@GetMapping("/travelDtls")
	public String trvelDtls() {
		String dtls=trvl.getTravelDtls();
		return dtls;
	}
	
}

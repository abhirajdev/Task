package com.adi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.adi.model.TravelModel;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TravelService implements ITravelService {

	@Override
	public String getTravelDtls() {
		
		TravelModel mod=new TravelModel();
		mod.setId(101);
		mod.setName("Abhishek");
		
		Map<String,String> map=new HashMap<>();
		
		map.put("8pm-9pm", "10km");
		map.put("9pm-10pm", "11km");
		map.put("10pm-11pm", "12km");
		
		mod.setTravelDtls(map);
		mod.setTtl_dist("33km");
		String json="";
		try {
			ObjectMapper om=new ObjectMapper();
			json=om.writerWithDefaultPrettyPrinter().writeValueAsString(mod);

			}catch(Exception e) {}
		return json;
	}

}

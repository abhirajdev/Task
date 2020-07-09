package com.adi.model;

import java.util.Map;

import lombok.Data;

@Data
public class TravelModel {

	private Integer id;
	private String name;
	private Map<String,String> travelDtls;
	private String ttl_dist;
}

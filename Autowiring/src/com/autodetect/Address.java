package com.autodetect;

import lombok.Data;

@Data
public class Address {

	private String area_Name;
	
	private String city_Name;

	public Address(String area_Name, String city_Name) {
		
		this.area_Name = area_Name;
		this.city_Name = city_Name;
	}
	
	
	
}

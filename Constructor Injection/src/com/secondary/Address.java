package com.secondary;

import lombok.Data;

@Data
public class Address {

	private String area_Name;
	
	private String city_Name;

	public Address(String area_Name, String city_Name) {
		super();
		this.area_Name = area_Name;
		this.city_Name = city_Name;
	}
	
}

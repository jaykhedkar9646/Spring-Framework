package com.autodetect;

import lombok.Data;

@Data
public class Student {

	private int s_Id;
	
	private String s_Name;
	
	private Address addrs;

	public Student(int s_Id, String s_Name, Address addrs) {
	
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.addrs = addrs;
	}
	
	
}

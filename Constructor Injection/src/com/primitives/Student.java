package com.primitives;

import lombok.Data;

@Data
public class Student {

	

	private int s_Id;
	
	private String s_Name;
	
	private long mob_No;
	
	public Student(int s_Id, String s_Name, long mob_No) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.mob_No = mob_No;
	}
}

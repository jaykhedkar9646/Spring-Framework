package com.secondary_array;

import lombok.Data;

@Data
public class Student {

	private int s_Id;
	
	private String s_Name;
	
	private Mobile[] mob_No;

	public Student(int s_Id, String s_Name, Mobile[] mob_No) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.mob_No = mob_No;
	}
	
	
}

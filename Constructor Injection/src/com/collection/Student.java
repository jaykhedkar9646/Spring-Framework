package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student {

	private List myList;
	
	private Set mySet;
	
	private Map myMap;

	public Student(List myList, Set mySet, Map myMap) {
		super();
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
	}
	
	
}

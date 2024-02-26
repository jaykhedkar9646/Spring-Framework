package com.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Primitives.xml");
		
		Student s = (Student) ac.getBean("s");
		System.out.println(s.getS_Id());
		System.out.println(s.getS_Name());
		System.out.println(s.getMob_No());
		
	}
}

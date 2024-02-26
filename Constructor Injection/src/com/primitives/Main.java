package com.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Primitives.xml");
		
		Student s=(Student) a.getBean("s");
		System.out.println(s.getS_Id()+"\n"
						   +s.getS_Name()+"\n"
						   +s.getMob_No());
		
		
	}
}

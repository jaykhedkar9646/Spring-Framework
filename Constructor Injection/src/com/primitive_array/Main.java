package com.primitive_array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Primitive_Array.xml");
		
		Student s=(Student) a.getBean("s");
		System.out.println(s.getS_Id()+"\n"+s.getS_Name());
		
		String[] mob_No = s.getMob_No();
		for(String mob:mob_No)
		{
			System.out.println(mob);
		}
		
	}
}

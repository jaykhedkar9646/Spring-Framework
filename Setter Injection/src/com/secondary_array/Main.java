package com.secondary_array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Secondary_Array.xml");
		
		Student s=(Student) ac.getBean("s");
		
		System.out.println(s.getS_Id()+"\n"+s.getS_Name());
		Mobile[] mob_No = s.getMob_No();
		
		for(Mobile mob:mob_No)
		{
			System.out.println(mob.getMob_No());
		}
		
	}
}

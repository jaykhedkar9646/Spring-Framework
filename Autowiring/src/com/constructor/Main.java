package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("constructor.xml");
		
		Student s=(Student) a.getBean("s");
		
		System.out.println(s.getS_Id()+"\n"+s.getS_Name());
		
		System.out.println(s.getAddrs().getArea_Name()+"\n"
						   +s.getAddrs().getCity_Name());
				
	}
}
 //when we use autowire="constructor" then 
//when we set primitive value define type as well(type="int")
//because autowiring doesn't support primitives.
package com.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("byName.xml");
		
		Student s=(Student) a.getBean("s");
		
		System.out.println(s.getS_Id()+"\n"+s.getS_Name());
		System.out.println(s.getAddrs().getArea_Name()+"\n"
						   +s.getAddrs().getCity_Name());
	}
}
 
//Here secondary reference name(private Address addrs) 
//and id(id="addrs") must be same
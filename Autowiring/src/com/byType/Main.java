package com.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("byType.xml");
		
		Student s=(Student) a.getBean("s");
		
		System.out.println(s.getS_Id()+"\n"+s.getS_Name());
		
		System.out.println(s.getAddrs().getArea_Name()+"\n"
						   +s.getAddrs().getCity_Name());
		
	}
}
//Here secondary bean must be only one(<bean id="a" class="com.byType.Address">)
//no more beans are allowed.
//if we want to take more than one bean for secondary class then
//use autowire-candidate tag.
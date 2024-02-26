package com.singleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Singleton.xml");
		
		Welcome wel = (Welcome) ac.getBean("w");
		System.out.println("First call..."+wel);
		
		Welcome wel1 = (Welcome) ac.getBean("w");
		System.out.println("Second call..."+wel1);
	}
}
//o/p:-
//	First call...com.beanfactory.singleton.Welcome@4c203ea1
//	Second call...com.beanfactory.singleton.Welcome@4c203ea1

//Spring by default take singleton scope
//Here we got same hashcode for both object(wel & wel1) of a bean
//It means however we will try to call multiple object for single bean
//only one object created for singleton scope


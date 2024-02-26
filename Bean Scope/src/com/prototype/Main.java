package com.prototype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Prototype.xml");
		
		Welcome wel = (Welcome) ac.getBean("w");
		System.out.println("First call..."+wel);
		
		Welcome wel1 = (Welcome) ac.getBean("w");
		System.out.println("Second call..."+wel1);
	}
}
//o/p:-
//	First call...com.prototype.Welcome@56ef9176
//	Second call...com.prototype.Welcome@4566e5bd

//Here we got different hashcode for both object(wel & wel1) of a bean
//It means however we will try to call multiple object for single bean
//we will got different object for prototype scope


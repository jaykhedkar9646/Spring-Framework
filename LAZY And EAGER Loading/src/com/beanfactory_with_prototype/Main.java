package com.beanfactory_with_prototype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("BeanFactory_With_Prototype.xml"));
		
		System.out.println("After creating object using getBean()");
		Welcome wel = (Welcome) bf.getBean("w");
		wel.wish();
	}
}
// o/p:-
//	Main Start
//	After creating object using getBean()
//	Constructor called...
//	Welcome to Spring IOC...

//Here constructor called after creating object using getBean()
//It means object create when getBean() called
//So it is LAZY loading





package com.applcontext_with_singleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplContext_With_Singleton.xml");
		
		System.out.println("After creating object using getBean()");
		Welcome wel = (Welcome) ac.getBean("w");
		wel.wish();
	}
}
// o/p:-
//	Main Start
//	Constructor called...
//	After creating object using getBean()
//	Welcome to Spring IOC...


//Here constructor called when xml file is inserted into ApplicationContext
//It means object create when xml file is inserted into ApplicationContext
//So it is EAGER loading





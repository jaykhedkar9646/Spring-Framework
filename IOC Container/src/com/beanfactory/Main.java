package com.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Here without creating Welcome class object Welcome class bean created
//by using Bean_Factory.xml file

public class Main {

	public static void main(String[] args) {
		
//		Resource r=new ClassPathResource("Bean_Factory.xml");
//		BeanFactory bf=new XmlBeanFactory(r);
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("BeanFactory.xml"));
		
		Welcome wel = (Welcome) bf.getBean("w");
		wel.wish();
		
	}
}

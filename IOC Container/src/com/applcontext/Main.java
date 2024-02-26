package com.applcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Here without creating Welcome class object Welcome class bean created
//by using Appl_Context.xml file


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplContext.xml");
		
		Welcome wel = (Welcome) ac.getBean("w");
		wel.wish();
		
	}
}

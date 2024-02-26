package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("Collection.xml");
		
		Student s= (Student) a.getBean("s");
		
		List myList = s.getMyList();
		for(Object list:myList)
		{
			System.out.println(list);
		}
		
		Set mySet = s.getMySet();
		for(Object set:mySet)
		{
			System.out.println(set);
		}
		
		Map myMap = s.getMyMap();
		Set keys = myMap.keySet();
		for(Object key:keys)
		{
			Object value = myMap.get(key);
			System.out.println(key+" "+value);
			
		}
		
		
		
	}
}

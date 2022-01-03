package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollection/config.xml");
		
		Person obj1 = (Person)context.getBean("personobj");
		System.out.println(obj1);
	}

}

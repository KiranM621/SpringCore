package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/config.xml");
		
		Employee emp = (Employee)context.getBean("emp1");
		
		System.out.println(emp);
	}

}

package com.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//multithreading
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/config.xml");
		
//		Hospital obj = (Hospital)context.getBean("hospitalobj1");
//		
//		System.out.println(obj);
//		
//		context.registerShutdownHook();
//	
//		College obj1 = (College)context.getBean("collegeobj1");
//		
//		System.out.println(obj1);
//		
//		context.registerShutdownHook();

		Car obj1 = (Car)context.getBean("carobj1");
		
		System.out.println(obj1);
		
		context.registerShutdownHook();

		
		
		
	}

}

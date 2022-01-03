package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		
		Student obj = (Student)context.getBean("student");
		
		System.out.println(obj);
		System.out.println(obj.hashCode());
		
		//singleton scope
		Student obj1 = (Student)context.getBean("student");

		System.out.println(obj1);
		//singleton scope
		System.out.println(obj1.hashCode());
	}

}

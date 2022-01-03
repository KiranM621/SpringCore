package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml"); 
		Employee emp1 = (Employee) context.getBean("Employee1");
		System.out.println(emp1);
		System.out.println(emp1.getNumber().getClass().getName());
		System.out.println(emp1.getId().getClass().getName());

	}

}

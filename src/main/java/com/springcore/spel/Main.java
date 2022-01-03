package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo obj = context.getBean("demo",Demo.class);
		System.out.println(obj);
	}

}

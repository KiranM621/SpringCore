package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referencetype/config.xml"); 		
		IPL obj = (IPL)context.getBean("iplobj");
		
		System.out.println(obj.getSponsor());
		System.out.println(obj.getFunds());
		
	}

}

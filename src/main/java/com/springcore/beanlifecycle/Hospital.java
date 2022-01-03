package com.springcore.beanlifecycle;

public class Hospital {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("In SetName");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + "]";
	}
	
	//after setName init() is called
	public void init() {
		System.out.println("Inside init");
	}
	
	public void destroy() {
		System.out.println("Inside destroy");
	}
	
}

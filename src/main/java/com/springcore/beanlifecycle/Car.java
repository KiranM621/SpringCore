package com.springcore.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
	// by default annotation is disabled 
	@PostConstruct
	public void init() {
		System.out.println("Init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}
}

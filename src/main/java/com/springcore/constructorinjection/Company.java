package com.springcore.constructorinjection;

public class Company {
	
	private String name;
	private String turnover;
	public Company(String name, String turnover) {
		super();
		this.name = name;
		this.turnover = turnover;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", turnover=" + turnover + "]";
	}

	
	
	

}

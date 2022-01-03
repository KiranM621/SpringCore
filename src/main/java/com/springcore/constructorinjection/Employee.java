package com.springcore.constructorinjection;

public class Employee {

	private String name;
	private int id;
	private Company cmp_name;
	
	public Employee(String name, int id,Company cmp_name) {
		super();
		this.name = name;
		this.id = id;
		this.cmp_name = cmp_name; 
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", cmp_name=" + cmp_name + "]";
	}
	
}

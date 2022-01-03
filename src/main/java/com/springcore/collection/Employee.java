package com.springcore.collection;

import java.util.List;
import java.util.Set;

public class Employee {

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", id=" + id + "]";
	}
	private String name;
	private List<String> number;
	private Set<Integer> id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNumber() {
		return number;
	}
	public void setNumber(List<String> number) {
		this.number = number;
	}
	public Set<Integer> getId() {
		return id;
	}
	public void setId(Set<Integer> id) {
		this.id = id;
	}
	
	
	
	
}

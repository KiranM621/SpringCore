package com.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class College implements InitializingBean,DisposableBean {
	
	private String college_Name;

	public String getCollege_Name() {
		return college_Name;
	}

	public void setCollege_Name(String college_Name) {
		System.out.println("In SetName");

		this.college_Name = college_Name;
	}

	@Override
	public String toString() {
		return "College [college_Name=" + college_Name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init()");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");

	}
	

}

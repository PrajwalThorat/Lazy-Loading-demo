package com.stackroute.easy_Lazy_loading_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLoadingDemo {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean Factory initialized");
		
		EmployeeManagerImpl mgr=(EmployeeManagerImpl) context.getBean("employeeManagerImpl");
		Employee emp=mgr.create();
		System.out.println(emp);
	}
}

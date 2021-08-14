package com.stackroute.easy_Lazy_loading_demo;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EmployeeManagerImpl implements EmployeeManager{

	public Employee create() {
		Employee emp=new Employee();
		emp.setEmpId("E001");
		emp.setEmpName("Mark");
		return emp;
	}
	
	@PostConstruct
	public void onInIt() {
		System.out.println("EmployeeManagerImpl Bean is initialized");
	}
}

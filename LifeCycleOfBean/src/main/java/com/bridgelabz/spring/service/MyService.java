//life cycle of bean analysis by annotation
package com.bridgelabz.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import com.bridgelabz.spring.model.Employee;
public class MyService
{
	private Employee employee;
	public MyService() {
		System.out.println("MyService no arg constructor");
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@PostConstruct
	public void init(){
		System.out.println("MyService init method called");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("MyService destroy method called");
	}
}

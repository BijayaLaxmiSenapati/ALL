//life cycle of bean analysis by method
package com.bridgelabz.spring.service;

import com.bridgelabz.spring.model.Employee;

public class MyEmployeeService 
{
	private Employee employee;
	public MyEmployeeService() {
		System.out.println("MyEmployeeService no arg constructor");
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void init() throws Exception {
		System.out.println("MyEmployeeService initializing to dummy values");
		/*if(employee.getName()==null) {
			employee.setName("Shyam Kumar");
		}*/
	}
	public void destroy() throws Exception {
		System.out.println("MyEmployeeService closing resources");
	}
}

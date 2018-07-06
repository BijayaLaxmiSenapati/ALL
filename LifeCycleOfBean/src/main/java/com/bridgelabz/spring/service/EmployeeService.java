//life cycle of bean analysys by interface
package com.bridgelabz.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.bridgelabz.spring.model.Employee;

public class EmployeeService implements DisposableBean, InitializingBean
{
	private Employee employee;
	public EmployeeService() {
		System.out.println("EmployeeService no arg constructor");
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployeeService initializing to dummy values");
		if(employee.getName()==null) {
			employee.setName("Bijaya Laxmi");
		}
	}
	public void destroy() throws Exception {
		System.out.println("EmployeeService closing resources");
	}
	
}

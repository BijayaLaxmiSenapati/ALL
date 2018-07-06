package com.bridgelabz.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.spring.service.EmployeeService;
import com.bridgelabz.spring.service.MyEmployeeService;
import com.bridgelabz.spring.service.MyService;

public class SpringMain
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("spring context initialized............");
		//MyEmployeeService service=context.getBean("myEmployeeService",MyEmployeeService.class);
		//EmployeeService service=context.getBean("employeeService",EmployeeService.class);
		MyService service=context.getBean("myService",MyService.class);

		System.out.println("Bean is retrieved........................");
		System.out.println("Employee name is:"+service.getEmployee().getName());
		context.close();
		System.out.println("Spring Context Closed");
	}
}

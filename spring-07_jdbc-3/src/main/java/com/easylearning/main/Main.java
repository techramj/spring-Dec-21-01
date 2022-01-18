package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//main will talk to the service
		EmployeeService empService = context.getBean("employeeService",EmployeeService.class);
		
		Employee emp = empService.getEmployeeDetail(1);
		System.out.println(emp);
		
	}

	

}

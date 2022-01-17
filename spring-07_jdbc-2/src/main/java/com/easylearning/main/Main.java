package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.config.SpringConfig1;
import com.easylearning.dao.EmpDaoWithDaoSource;
import com.easylearning.dao.EmpDaoWithJdbcTemplate;
import com.easylearning.entity.Employee;
import com.easylearning.service.CreditCardService;
import com.easylearning.service.LoanService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// ApplicationContext context1 = new
		// AnnotationConfigApplicationContext(SpringConfig1.class);

		demo(context);
	}

	public static void demo(ApplicationContext context) {
		EmpDaoWithDaoSource dao = (EmpDaoWithDaoSource) context.getBean("empDaoWithDaoSource");
		Employee emp = dao.getEmployeeById(2);
		System.out.println(emp);

		EmpDaoWithJdbcTemplate dao1 = context.getBean("empDaoWithJdbcTemplate", EmpDaoWithJdbcTemplate.class);
		Employee emp1 = dao1.getEmployeeById(3);
		System.out.println(emp1);
		
		//System.out.println(dao1.findAll());
		dao1.addEmployee(new Employee(6,"johnson",2000));
		dao1.findAll().forEach(System.out::println);
	}

}

package com.easylearning.main;

import java.util.Currency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.config.SpringConfig1;
import com.easylearning.model.Address;
import com.easylearning.model.Employee;
import com.easylearning.model.MyBean;

public class Main {
	
	public static void main(String[] args) {
		xmlDemo();
		
		//javaConfigDemo();
	}
	
	public static void javaConfigDemo() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
	    Address address =context.getBean("address",Address.class);
	    System.out.println(address);
	    
	    Employee employee =context.getBean("employee",Employee.class);
	    System.out.println(employee);
	    
	   
	    
		
	}
	
	public static void xmlDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	    Address address =context.getBean("address",Address.class);
	    System.out.println(address);
	    
	    Employee employee =context.getBean("employee",Employee.class);
	    System.out.println(employee);
	    
	    MyBean myBean =context.getBean("myBean",MyBean.class);
	    System.out.println(myBean);
		
	}

}

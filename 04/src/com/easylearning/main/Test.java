package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.Car;
import com.easylearning.Employee;
import com.easylearning.SingleTon;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Car car1 = context.getBean("car",Car.class);
		Car car2 = context.getBean("car",Car.class);
		
		System.out.println(car1==car2);
		
		car1.setName("Tata");
		car2.setName("Nissan");
		
		System.out.println(car1.getName());
		System.out.println(car2.getName());
		
		System.out.println(System.console());
		
		
	}
	
}

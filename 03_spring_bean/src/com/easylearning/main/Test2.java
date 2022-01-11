package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.Bike;
import com.easylearning.Car;
import com.easylearning.Drawing;
import com.easylearning.Employee;
import com.easylearning.config.MyConfiguration;

public class Test2 {

	public static void main(String[] args) {
		//ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Car car1 = context.getBean("car1",Car.class);
		Car car2 = context.getBean("car1",Car.class);
		System.out.println(car1 == car2);
		
		Bike bike1 = context.getBean("bike",Bike.class);
		Bike bike2 = context.getBean("bike",Bike.class);
		System.out.println(bike1==bike2);
		
	
		
	}
	
	
}

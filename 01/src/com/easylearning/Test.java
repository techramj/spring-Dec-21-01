package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		
	}
	
	public static void foo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car c1=(Car)context.getBean("car1");
		System.out.println(c1);
		
		Car c2 = context.getBean("c2", Car.class);
		System.out.println(c2);
		
		Bike b= context.getBean("bike", Bike.class);
		System.out.println(b);
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
	}

	public static void foo() {
		Car car1 = new Car("BMW");

		Car c2 = new Car();
		c2.setName("Tata Nano");

		Bike bike = new Bike("Bullet");

		Employee emp = new Employee(1, "Jack", 1000);
		// emp.setVehicle(car1);

		emp.setVehicle(bike);
	}

}

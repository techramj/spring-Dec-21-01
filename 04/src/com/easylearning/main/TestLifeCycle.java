package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.Car;

public class TestLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext a=(AbstractApplicationContext) context;
		a.registerShutdownHook();

		Car car1 = context.getBean("car", Car.class);
		
		

		
		
		((AbstractApplicationContext) context).close();
		
		Thread.sleep(3);
	
	}

}

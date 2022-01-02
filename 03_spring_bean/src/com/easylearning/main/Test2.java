package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.Drawing;
import com.easylearning.Employee;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Drawing draw = context.getBean("abc",Drawing.class);
		System.out.println(draw);
		
	}
	
	
}

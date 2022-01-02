package com.easylearning.main;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.easylearning.Bike;
import com.easylearning.Car;
import com.easylearning.Employee;

public class Test {
	
	public static void main(String[] args) {
		//1.BeanFactory
		 ClassPathResource classPathResource = new ClassPathResource("spring.xml");
		 BeanFactory factory = new XmlBeanFactory(classPathResource);
		 Car c1=factory.getBean("car",Car.class);
		 Car c2=factory.getBean("car",Car.class);
		 System.out.println(c1==c2);
		 
		 Bike b1=factory.getBean("bike",Bike.class);
		 Bike b2=factory.getBean("bike",Bike.class);
		 System.out.println(b1==b2);
		 
		 
		
		
		//2.ApplicationContext
		// ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		 
		 
		 
		 
		 
			
		
	}

}

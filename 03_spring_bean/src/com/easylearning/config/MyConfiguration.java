package com.easylearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.easylearning.Bike;
import com.easylearning.Car;

@Configuration
public class MyConfiguration {
	
	@Scope("prototype")
	@Bean
	public Car car1() {
		System.out.println("inside config car bean");
		Car c = new Car();
		return c;
	}
	
	@Bean
	public Bike bike() {
		System.out.println("inside config bike bean");
		Bike b=new Bike();
		return b;
	}

}

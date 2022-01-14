package com.easylearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easylearning.model.Address;
import com.easylearning.model.Employee;

@Configuration
public class SpringConfig2 {
	
	@Bean
	public Employee employee(Address address) {
		Employee e= new Employee(11, "Jessica", 999);
		e.setAddress(address);
		return e;
	}

}

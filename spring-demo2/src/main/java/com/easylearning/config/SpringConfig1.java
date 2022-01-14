package com.easylearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.easylearning.model.Address;

@Configuration
@Import(value = SpringConfig2.class)
public class SpringConfig1 {
	
	@Bean
	public Address address() {
		return new Address(411021, "Mumbai");
	}
	
	

}

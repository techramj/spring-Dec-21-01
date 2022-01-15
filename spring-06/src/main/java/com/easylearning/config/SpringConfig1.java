package com.easylearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.easylearning.aop.Logger;
import com.easylearning.aop.TransactonAspect;
import com.easylearning.service.CreditCardService;
import com.easylearning.service.LoanService;

@Configuration
@ComponentScan(basePackages = "com.easylearning")
@EnableAspectJAutoProxy
public class SpringConfig1 {

	@Bean
	public LoanService loanService() {
		return new LoanService();
	}

	@Bean
	public CreditCardService creditCardService() {
		return new CreditCardService();
	}

	/*
	 * @Bean public TransactonAspect transactonAspect() { return new
	 * TransactonAspect(); }
	 * 
	 * @Bean public Logger logger() { return new Logger(); }
	 */

}

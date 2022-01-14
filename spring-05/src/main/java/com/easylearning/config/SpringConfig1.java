package com.easylearning.config;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easylearning.aop.LogBeforeAndAfter;
import com.easylearning.service.CreditCardService;
import com.easylearning.service.LoanService;

@Configuration
public class SpringConfig1 {
	
  @Bean
  public LoanService loanService() {
	  return new LoanService();
  }
  
  @Bean
  public CreditCardService creditCardService() {
	  return new CreditCardService();
  }
  
  @Bean
  public LogBeforeAndAfter logBeforeAndAfter() {
	  return new LogBeforeAndAfter();
  }
  
  @Bean
  public ProxyFactoryBean creditCardServiceProxy() {
	  String[] interceptorNames = {"logBeforeAndAfter"};
	  ProxyFactoryBean proxy = new ProxyFactoryBean();
	  proxy.setTarget(creditCardService());
	  proxy.setInterceptorNames(interceptorNames);
	  return proxy;
  }
	

}

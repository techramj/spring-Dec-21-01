package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.config.SpringConfig1;
import com.easylearning.service.CreditCardService;
import com.easylearning.service.LoanService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig1.class);
		
		demo(context1);
		
	
	}
	
	
	public static void demo(ApplicationContext context) {
		LoanService loanService= (LoanService) context.getBean("loanService");
		loanService.issueLoan("cust1111");
		loanService.closeLoan("cust2222");
		
		System.out.println("_____________________________");
		
		CreditCardService creditCardService= (CreditCardService) context.getBean("creditCardServiceProxy");
		creditCardService.issueCreditCard("cust1111");
		creditCardService.payDue("cust1111");
	}

}

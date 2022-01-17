package com.easylearning.service;

public class CreditCardService {
	
	public void issueCreditCard(String customerId) {
		
		System.out.println("credit card issued for customer :"+customerId);
		
	}
	
	public void blockCreditCard(String customerId) {
		System.out.println("credit card blocked for customer :"+customerId);
	}
	
	public void payDue(String customerId) {
		System.out.println("Paying credit card due for customer :"+customerId);
	}

}

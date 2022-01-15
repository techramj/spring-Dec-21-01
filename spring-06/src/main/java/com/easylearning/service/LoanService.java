package com.easylearning.service;

public class LoanService {
	
	public Boolean issueLoan(String customerId) {
		//transaction
		//log
	
		System.out.println("loan issued for customer: "+customerId);
		if(1==1) {
			throw new IllegalArgumentException();
		}
		return false;
		
	}
	
	public void clearLoan(String customerId) {
		System.out.println("loan clear for customer: "+customerId);
		
	}
	
	public void closeLoan(String customerId) {	
		System.out.println("loan closed for customer: "+customerId);
	}

}

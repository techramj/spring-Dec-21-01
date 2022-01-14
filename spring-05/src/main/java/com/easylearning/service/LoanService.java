package com.easylearning.service;

public class LoanService {
	
	public void issueLoan(String customerId) {
		System.out.println("Entered LoanService.issueLoan");
		//security
		//exception Handling
		//transaction
	
		System.out.println("loan issued for customer: "+customerId);
		System.out.println("Exit LoanService.issueLoan");
	}
	
	public void clearLoan(String customerId) {
		System.out.println("Entered LoanService.clearLoan");
		System.out.println("loan clear for customer: "+customerId);
		System.out.println("exit LoanService.clearLoan");
	}
	
	public void closeLoan(String customerId) {
		System.out.println("Entered LoanService.closeLoan");
		System.out.println("loan closed for customer: "+customerId);
		System.out.println("exit LoanService.closeLoan");
	}

}

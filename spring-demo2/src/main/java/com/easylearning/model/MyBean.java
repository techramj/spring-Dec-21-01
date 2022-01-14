package com.easylearning.model;

import java.util.Currency;

public class MyBean {

	private int a;
	private double b;
	private Currency curr;
	private Password password;

	public MyBean() {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Currency getCurr() {
		return curr;
	}

	public void setCurr(Currency curr) {
		this.curr = curr;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyBean [a=" + a + ", b=" + b + ", curr=" + curr + ", password=" + password + "]";
	}

}

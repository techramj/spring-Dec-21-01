package com.easylearning;

public class Car extends Vehicle{
	
	private String name;
	private String licenseNumber;
	
	public Car() {
		System.out.println("car construtor called");
	}

	public Car(String name) {
		System.out.println("car paramererized constructor called");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	
	
	
}

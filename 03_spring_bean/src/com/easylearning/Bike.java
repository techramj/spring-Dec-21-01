package com.easylearning;

public class Bike extends Vehicle {

	private String name;

	public Bike() {
		System.out.println("bike constructor default bean");
	}

	public Bike(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + "]";
	}
	
	

}

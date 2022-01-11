package com.easylearning;

public class Bike {

	public String name;

	public Bike() {
		// TODO Auto-generated constructor stub
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

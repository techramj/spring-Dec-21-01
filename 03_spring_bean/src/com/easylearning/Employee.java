package com.easylearning;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private Vehicle vehicle;
	
	
	public Employee() {
		System.out.println("inside employee default constructor");
	}
	
	public Employee(Vehicle vehicle) {
		System.out.println("inside emp constructor with one parameter");
		this.vehicle = vehicle;
	}

	public Employee(int id, String name, double salary, Vehicle vehicle) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vehicle = vehicle;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", vehicle=" + vehicle + "]";
	}
	
	
	
}

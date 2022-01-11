package com.easylearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	@Autowired
	@Qualifier(value = "car")
	private Vehicle vehicle;
	
	@Autowired
	private Address address;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, Vehicle vehicle) {
		super();
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
	
	public Employee(Vehicle vehicle) {
		System.out.println("inside Emp(vehicle) constructor");
		this.vehicle=vehicle;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", vehicle=" + vehicle + ", address="
				+ address + "]";
	}

	
	
	
	
}

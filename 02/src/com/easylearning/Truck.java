package com.easylearning;

public class Truck {

	private String name;
	private String number;
	private boolean isNHPermitAllowed;

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String name, String number, boolean isNHPermitAllowed) {
		super();
		this.name = name;
		this.number = number;
		this.isNHPermitAllowed = isNHPermitAllowed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isNHPermitAllowed() {
		return isNHPermitAllowed;
	}

	public void setNHPermitAllowed(boolean isNHPermitAllowed) {
		this.isNHPermitAllowed = isNHPermitAllowed;
	}

	@Override
	public String toString() {
		return "Truck [name=" + name + ", number=" + number + ", isNHPermitAllowed=" + isNHPermitAllowed + "]";
	}

}

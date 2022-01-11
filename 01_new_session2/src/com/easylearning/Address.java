package com.easylearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String pincode;
	private String city;
	
	@Autowired
	private LandMark landMark;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String pincode, String city, LandMark landMark) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.landMark = landMark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LandMark getLandMark() {
		return landMark;
	}

	public void setLandMark(LandMark landMark) {
		this.landMark = landMark;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", landMark=" + landMark + "]";
	}
	
	

}

package com.easylearning;

import org.springframework.stereotype.Component;

@Component
public class LandMark {
	
	private String value;
	
	public LandMark() {
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LandMark [value=" + value + "]";
	}
	
	

}

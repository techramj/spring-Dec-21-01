package com.easylearning;

import org.springframework.stereotype.Component;

@Component
public class Triangle extends Shape{
	
	private int side;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Triangle [side=" + side + "]";
	}
	
	

}

package com.easylearning;

import org.springframework.stereotype.Component;

@Component
public class Rectangle extends Shape {

	private int length;
	private int widht;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int widht) {
		super();
		this.length = length;
		this.widht = widht;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

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
		return "Rectangle [length=" + length + ", widht=" + widht + "]";
	}
	
	

}

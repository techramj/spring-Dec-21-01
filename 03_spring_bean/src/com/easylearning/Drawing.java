package com.easylearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="abc")
public class Drawing {
	
	@Autowired
	private Circle circle;
	
	@Autowired
	private Triangle triangle;
	
	@Autowired
	private Rectangle rectangle;
	
	public Drawing() {
		// TODO Auto-generated constructor stub
	}

	public Drawing(Circle circle, Triangle triangle, Rectangle rectangle) {
		super();
		this.circle = circle;
		this.triangle = triangle;
		this.rectangle = rectangle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	@Override
	public String toString() {
		return "Drawing [circle=" + circle + ", triangle=" + triangle + ", rectangle=" + rectangle + "]";
	}
	
	
	
	

}

package com.easylearning;

public class Test {
	
	public static void main(String[] args) {
		Car car1 = new Car("BMW");
		
		Bike bike = new Bike("Bullet");
		
		Employee emp = new Employee(1, "Jack", 1000);
		//emp.setVehicle(car1);
		
		emp.setVehicle(bike);
			
		
	}

}

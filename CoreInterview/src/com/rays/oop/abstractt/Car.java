package com.rays.oop.abstractt;

public class Car extends Vahical{
	
	public void start() {
		System.out.println("Car engine starts");
	}

	public Car(int speed, String brand) {
		super(speed, brand);
	}
	public static void main(String[] args) {
		Car c = new Car( 200 ," BMW ");
		c.getInfo();
		c.start();
		
	}

}

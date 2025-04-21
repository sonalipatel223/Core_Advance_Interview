package com.rays.oop.abstractt;

public abstract class Vahical {

	int speed;
	String brand;

	public Vahical(int speed, String brand) {
		this.brand = brand;
		this.speed = speed;
	}

	public abstract void start();

	public void getInfo() {
		System.out.println("Vahical brand" + brand );
		System.out.println("Vahical Speed" + speed );
	}

}

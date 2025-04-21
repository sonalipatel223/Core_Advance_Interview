package com.rays.oop;

public class Circle extends Shapee {

	@Override
	public void area() {
		System.out.println("this is area");
	}

	public static void main(String[] args) {
		Shapee s = new Circle();
		s.draw();
		s.area();

	}
}

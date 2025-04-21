package com.rays.oop;

public class Square extends Shape {

	public void draw() {
		System.out.println("Square");
	}

	public static void main(String[] args) {
		Shape s = new Square();      // call parent ki hoti he but chalti child ki he  
		Shape s1 = new Shape(); 
		s.draw();
		s1.draw();

	}
}

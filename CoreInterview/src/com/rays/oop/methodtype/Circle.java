package com.rays.oop.methodtype;

public class Circle extends Shape{
	
	public double radius;
	public final double PI= 3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double area() {
		return PI* radius *radius;
		
	}
	

}
//Java mein final keyword ka use kisi variable ko constant banane ke liye kiya jata hai.
	//Jab hum PI ko final define karte hain, 
	//iska matlab hota hai ki uski value program ke execution ke dauraan kabhi change nahi ho sakti. Iska use aur importance samajhte hain:


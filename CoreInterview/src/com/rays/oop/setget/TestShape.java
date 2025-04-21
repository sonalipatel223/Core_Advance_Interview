package com.rays.oop.setget;

public class TestShape {

	
		public static void main(String[] args) {
			
			Shape[] s = new Shape[2];
			s[0] = new Circle();
			s[1] = new Rectangle();

			Circle c = (Circle) s[0];// Typecasting the Shape reference to Circle
			c.setRadius(10);// Now you can access Circle's method like setRadius()

			System.out.println(s[0].area());

			Rectangle r = (Rectangle) s[1];
			r.setLength(10);
			r.setWidth(10);
			System.out.println(s[1].area());
			
//			double a = Area(s);
//			System.out.println(a);
//
//			
//			
//		}
//		
//		public static double Area(Shape[] s) {
//			double totalArea = 0;
//
//			for (int i = 0; i < s.length; i++) {
//				totalArea = totalArea + s[i].area();
//			}
//			return totalArea;
		}

	}


	//Typecasting is used to access the specific methods of Circle or Rectangle (like setRadius() for Circle or setLength() for Rectangle). 
	//If you don�t use typecasting, the compiler won�t know that s[0] actually holds a Circle object,and it won�t allow you to access the setRadius() method.

// perent class ki property ko child class me use karne ke liye type castting krte he 







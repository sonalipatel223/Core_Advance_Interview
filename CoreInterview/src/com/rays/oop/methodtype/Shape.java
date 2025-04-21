package com.rays.oop.methodtype;

public class Shape {
	//Array with methodType
	
	public double area() {
		return 0;
		
	}
	
	public static Shape getShape(int i) {
		
		//Iska fayda hai ki aapko alag-alag shapes ka object manually create karne ki zarurat nahi hai.
		//Bas ek integer input pass karo, aur required shape ka object mil jayega.
	   
		if (i == 1) {
	        return new Rectangle(10, 20);  // Agar i == 1 ho, to Rectangle ka object return karo
	    }
	    if (i == 2) {
	        return new Circle(10);  // Agar i == 2 ho, to Circle ka object return karo
	    }
	    return new Shape();  // Agar i 1 ya 2 na ho, to default Shape ka object return karo
	}

}

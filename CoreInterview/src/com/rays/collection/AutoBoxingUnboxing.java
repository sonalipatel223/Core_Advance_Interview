package com.rays.collection;

public class AutoBoxingUnboxing {
	
	public static void main(String[] args) {

		// AutoBoxing
		// primitive data is converted into Object, it is called Auto-boxing
		int a = 10;
		Integer b = a;

		System.out.println( b);

		// Unboxing 
		//Unboxing ka matlab hota hai Wrapper class object ko wapas primitive type mein convert karna.

		Integer c = new Integer(15);
		int d = c;
		System.out.println(d);

	}


}

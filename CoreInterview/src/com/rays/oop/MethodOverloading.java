package com.rays.oop;

public class MethodOverloading {

	// Method overloading ka matlab hota hai ki ek hi naam ke multiple
	// methods hote hain lekin unka parameter list alag hota hai

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;

	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(10, 20, 30));

	}

}

//Ek hi class me same method name ke saath alag-alag parameters define karte hain.
// Same class ke andar hota hai.	
// Method name same hoti hai, lekin parameters different hote hain (number, type, ya order me).

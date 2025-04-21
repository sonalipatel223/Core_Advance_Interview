package com.rays.oop;

public class ConstructorCallingTest extends ConstructorCalling{
	
	public ConstructorCallingTest(String fName, String lName, String address) {
		super(fName, lName, address); 
	}

	public static void main(String[] args) {
		ConstructorCallingTest t = new ConstructorCallingTest("Sonali", "Patel", "indore");
	}

}

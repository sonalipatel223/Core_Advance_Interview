package com.rays.oop;

public class ConstructorCalling {
	
	//Constructor calling ka use hota hai jab hm ek constructor
	//ke through doosra constructor ko call karte ho.

	String fName;
	String lName;
	String address;

	public ConstructorCalling(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName);
		System.out.println(lName);
	}

	
	//Jab tum 3-parameter wala constructor call karte ho, pehle 2-parameter wala
	//constructor execute hota hai because of this(fName, lName) Uske baad address set hota hai aur print hota hai


	public ConstructorCalling(String fName, String lName, String address) {
		this(fName, lName);

		this.address = address;
		System.out.println(address);
	}
}


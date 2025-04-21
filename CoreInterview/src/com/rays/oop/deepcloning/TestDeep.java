package com.rays.oop.deepcloning;

public class TestDeep {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Costumer c = new Costumer("Shivanshi",100);
		Costumer c1 = (Costumer) c.clone();           //Gupta 200, Gupta 200
		c1.name = "Gupta";                          //Shivanshi 100, Shivanshi 200
		c1.no.balance = 200;

		System.out.println(c.name);
		System.out.println(c.no.balance);

		System.out.println(c1.name);
		System.out.println(c1.no.balance);

	

	}

}

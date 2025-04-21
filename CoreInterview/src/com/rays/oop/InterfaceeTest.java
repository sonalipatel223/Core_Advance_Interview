package com.rays.oop;

public class InterfaceeTest implements Interfacee {

	public int sum(int a, int b) {
		return a + b;
		
	}

	public static void main(String[] args) {

		InterfaceeTest i = new InterfaceeTest();

		System.out.println(i.sum(10, 20));

		System.out.println(i.x);
	}

}

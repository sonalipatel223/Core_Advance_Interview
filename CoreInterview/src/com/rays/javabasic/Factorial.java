package com.rays.javabasic;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int a = 4;

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}


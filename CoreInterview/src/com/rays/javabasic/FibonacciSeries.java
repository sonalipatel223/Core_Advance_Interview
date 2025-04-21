package com.rays.javabasic;


public class FibonacciSeries { //(Sequence of no..)
	public static void main(String[] args) {

		int x = 0;
		int y = 1;

		for (int i = 1; i <=5; i++) {
			int z = x + y;

			x = y;
			y = z;
			System.out.println(z);
		}
	}
}

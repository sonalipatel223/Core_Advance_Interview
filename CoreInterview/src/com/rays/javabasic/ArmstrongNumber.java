package com.rays.javabasic;

public class ArmstrongNumber {
	public static void main(String[] args) {

		int a = 153;
		int b = a;
		int c = 0;
		int d = 0;

		while (b > 0) {
			d = b % 10;              // 3
			c = c + (d * d * d);
			b = b / 10;                // 15

		}
		if (a == c) {
			System.out.println("It is ArmstrongNo..");

		} else {
			System.out.println("it is not armstrong");
		}
	}

}

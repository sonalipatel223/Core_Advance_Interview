package com.rays.javabasic;

public class Palindrome {
	public static void main(String[] args) {

		int a = 1221;
		int b = a;
		int c = 0;
		int d = 0;

		while (b > 0) {
			d = b % 10;
			c = c * 10 + d;
			b = b / 10;

		}
		if (a == c) {
			System.out.println("yes is a Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}

}

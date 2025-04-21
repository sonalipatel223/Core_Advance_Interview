package com.rays.javabasic;


public class Pyramid {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("* ");             // space only right side
			}
			System.out.println();
		}
	}

}


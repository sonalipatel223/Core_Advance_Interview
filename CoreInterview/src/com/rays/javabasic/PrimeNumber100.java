package com.rays.javabasic;


public class PrimeNumber100 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 20; i++) {
			int count = 0;

			for (int j = 2; j < i-1; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 0) {

				System.out.println(i);
		}
	}
	}
}


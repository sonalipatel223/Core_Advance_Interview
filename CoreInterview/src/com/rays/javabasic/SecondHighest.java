     package com.rays.javabasic;

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = { 33, 45, 57, 100,89, 111 };
		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > b) {
				a = b;
				b = arr[i];

			}
			if (arr[i] < b && arr[i] > a) {
				a = arr[i];
			}
		}
		System.out.println(a);

	}

	}
	

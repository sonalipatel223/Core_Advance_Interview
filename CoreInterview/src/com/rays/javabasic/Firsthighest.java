package com.rays.javabasic;

public class Firsthighest {
	public static void main(String[] args) {

		int[] arr = { 20, 14, 27, 550, 45 };
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > a) {
				a = arr[i];
			}
		}

		System.out.println(a);
	}

}


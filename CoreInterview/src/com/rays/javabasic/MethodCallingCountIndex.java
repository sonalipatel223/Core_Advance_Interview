package com.rays.javabasic;

public class MethodCallingCountIndex {

	public static int index(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i; 
			}
		}
		return -1; 
	}

	public static void main(String[] args) {
		int[] arr = { 10, 30, 15, 20 };
		int num = 20;

		int index = index(arr, num); 
		System.out.println(index);
	}

}



package com.rays.exception;

public class ArrayIndexOutOfBoundException1 {
	public static void main(String[] args) {
		
		try {

			int[] arr = { 1, 2, 3, 4, 5 };

			System.out.println(arr[12]);

		} catch (Exception e) {

			System.out.println(e);

		}
	}

}

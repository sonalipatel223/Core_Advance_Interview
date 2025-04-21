 package com.rays.string;

import java.util.Arrays;

import java.util.Arrays;

public class HoldInIntergerArray {
	public static void main(String[] args) {
		String name = "schin123jat ";

		String result = "";
	int result1 = 0;

		char[] ch = name.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				result = result + ch[i];
				
				result1 = result1 + Integer.parseInt(String.valueOf(ch[i]));
				
				System.out.print("");
			}
		}
		
		// char[] intArray=result.toCharArray();
		 System.out.println(result);

		// Convert numeric result string to int array
		int[] intArray = new int[result.length()];
		for (int i = 0; i < result.length(); i++) {
			intArray[i] = Character.getNumericValue(result.charAt(i));
	}

		// System.out.println(intArray[i]);
		System.out.println(Arrays.toString(intArray));
		System.out.println(result1);
	}
}

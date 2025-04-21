package com.rays.javabasic;

public class BubbleShort {
	public static void main(String[] args) {
		// arrange the elements of an array in assending order

		int[] num = { 100, 50, 1, 10, 25 };

		int temp = 0;

		for (int i = 0; i < num.length ; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
				
			}
			
			System.out.println(num[i]);
			
			
			
		}
	}
}

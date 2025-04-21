package com.rays.javabasic;

public class EvenOddNumber {
	public static void main(String[] args) {

		for (int i = 100; i < 200; i++) {
			
			//if(i%2==0) {           //(even)
				
			if (i%2 != 0) {      // (odd)

				System.out.println(i);
			}

		}
	}

}


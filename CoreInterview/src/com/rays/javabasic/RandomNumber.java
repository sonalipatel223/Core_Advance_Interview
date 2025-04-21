package com.rays.javabasic;

public class RandomNumber {
	public static void main(String[] args) {
		

		for(int i=1; i<=5; i++) {
			int j=(int)(Math.random()*1000);               // 3 digit random
			
			//int j=(int)(Math.random()*9000)+1000;              // 4 digit random
		
	    System.out.println(j);
	}

	}
}

		        


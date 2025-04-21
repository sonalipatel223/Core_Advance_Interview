package com.rays.javabasic;

public class ReverseNumber {
	public static void main(String[] args) {

		
		int a= 122;
		int b=a;
		int c=0;
		int d=0;
		
		while(b > 0) {
			
			d =b%10;
			c= c*10+d;
			b= b/10;
		}
		System.out.println(c);
	}

}

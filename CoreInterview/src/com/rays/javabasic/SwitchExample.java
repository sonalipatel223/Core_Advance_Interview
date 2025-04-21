package com.rays.javabasic;


public class SwitchExample {
	public static void main(String[] args) {
		
		int a=12;
		int b=6;
		
		char operator ='/';
		
		switch(operator) {
		case'+':
			System.out.println(" Result:"+ (a+b));
			break;
			
		case'-':
			System.out.println(a-b);
			break;
			
		case'*':
			System.out.println(a*b);
			break;
			
		case'/':
			if(b !=0) {
			System.out.println(a/b);
			
			}else {
				System.out.println("Cannot divide by zero");
			}
			break;
			default:
				System.out.println("Invalid operator");
			
			
		}

	}

}


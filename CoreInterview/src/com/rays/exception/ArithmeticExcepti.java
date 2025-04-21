
package com.rays.exception;

public class ArithmeticExcepti {
	
	public static void main(String[] args) {
		//int a = 10;
		try {
			int c = 10 / 0;
			//System.out.println(c);
		} catch (ArithmeticException e) {
			// agar error aati hai, toh catch block me aayega

			System.out.println(e);
			//System.out.println(e.getMessage());
		}
	}


}

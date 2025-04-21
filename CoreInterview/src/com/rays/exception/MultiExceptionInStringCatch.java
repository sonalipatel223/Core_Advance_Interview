
package com.rays.exception;

public class MultiExceptionInStringCatch {
	public static void main(String[] args) {
		
		//String s = null;
		try {
			//System.out.println(s.length());
			int i = 10 / 0;
		} catch (  NullPointerException| ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}

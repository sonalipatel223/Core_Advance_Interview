
package com.rays.exception;

public class TryCatchInsideFinally {
	
	public static void main(String[] args) {

		String s = null;
		try {
			int i = 10/0;
			System.out.println(i);
		} finally {
		try {
		System.out.println(s.length());	
		
		}catch (NullPointerException e) {
			System.out.println(e);
		}
			
		}
	}
	}




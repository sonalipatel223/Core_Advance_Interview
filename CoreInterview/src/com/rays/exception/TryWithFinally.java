
package com.rays.exception;

public class TryWithFinally {
	
	public static void main(String[] args) {

		String s = "sona";
		try {
			
			System.out.println(s.charAt(10));
			//System.exit(0);
		} finally {
			System.out.println("end of program.............");
		}

	}


}

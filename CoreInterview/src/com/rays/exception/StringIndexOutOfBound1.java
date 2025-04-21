
package com.rays.exception;

public class StringIndexOutOfBound1 {
public static void main(String[] args) {
	
	String s = "sonali";
	try {
		//for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(11));
		//}
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
}
}

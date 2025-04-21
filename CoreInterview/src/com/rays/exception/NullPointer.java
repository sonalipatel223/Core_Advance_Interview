
package com.rays.exception;

public class NullPointer {
	public static void main(String[] args) {
		//String a = "sona";
		String a=null;
        try{
            System.out.println(a.length());                                                                                                          
        }catch (NullPointerException e){
            System.out.println(e);
	}
	}

}

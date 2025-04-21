
package com.rays.exception;

public class NumberFormatExcep {
	public static void main(String[] args) {
		
	
	 String s="Sona123";
     try {
     	
         int i=Integer.parseInt(s);
        
     }catch (NumberFormatException e){
         System.out.println(e);
     }
	}
 
}

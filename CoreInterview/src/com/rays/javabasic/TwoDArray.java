package com.rays.javabasic;


public class TwoDArray {
	public static void main(String[] args) {
		

	    int [][]a= new int [5][5];
	    
	    for(int i=0; i<a.length; i++) {
	    	for(int j=0; j<a.length; j++) {
	    		a[i][j]= (i+1)*(j+1);
	    		System.out.print(a[i][j]+"\t");
	    	}
	    	System.out.println();
			}
	}

}


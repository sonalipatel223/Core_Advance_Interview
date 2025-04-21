
package com.rays.thread;

public class TestWithoutThread {

	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("abc");
		WithoutThread t2 = new WithoutThread("xyz");
		
		t1.run();
		t2.run(); 
	}
}
//Is class mein Thread ka use nahi kiya gaya, iska matlab hai ki yeh 
//ek simple object hai jo sequentially execute hota hai.
//run() method ko call karte waqt program line-by-line execute karega.
//Matlab yeh method sequentially execute hoga, ek ke baad ek.

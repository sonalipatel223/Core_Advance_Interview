
package com.rays.thread;

public class TestPriorityThread {

	public static void main(String[] args) {
		
		PriorityThread t1  = new PriorityThread("SN");
		PriorityThread t2  = new PriorityThread("AB");
		
		t1.setPriority(10);		
		t2.setPriority(2);
		
		t1.start();
		t2.start();
	}
}

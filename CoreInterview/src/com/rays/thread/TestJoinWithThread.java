
package com.rays.thread;

public class TestJoinWithThread {

	public static void main(String[] args) {
		
		JoinThread t1 = new JoinThread("SS");
		JoinThread t2 = new JoinThread("NN");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}

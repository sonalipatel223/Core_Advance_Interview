
package com.rays.thread;

public class TestDaemonThreadB{

	public static void main(String[] args) {
		
		BackgroundThread t1 = new BackgroundThread("Daemon Thread");
		
		t1.setDaemon(true);
		t1.start();
		
		for (int i =1; i <=5 ; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"Main");
		}
	}
}
//setDaemon(true) ek thread ko "daemon thread" bana deta hai.


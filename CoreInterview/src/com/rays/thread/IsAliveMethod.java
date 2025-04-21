package com.rays.thread;

public class IsAliveMethod extends Thread {

	@Override
	public void run() {
		System.out.println("Method is alive.....");
	}
	public static void main(String[] args) {

		IsAliveMethod t1 = new IsAliveMethod();
		IsAliveMethod t2 = new IsAliveMethod();

		System.out.println(t1.isAlive());
		t1.start();

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());

		t2.start();

		System.out.println(t2.isAlive());
	}
}
//t1.isAlive(): Is line mein t1 thread ke alive state ko check kiya gaya hai.
//Jab thread start nahi hua hota, tab is method ka return value false hota hai.
//t1 thread ka run() method execute hoga.
//"Method is alive....." print karega.
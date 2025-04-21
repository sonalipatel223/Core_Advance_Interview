package com.rays.thread;

public class PriorityThread  extends Thread{

	String name;
	
	public PriorityThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(i +"="+ name);
		}
	}
}
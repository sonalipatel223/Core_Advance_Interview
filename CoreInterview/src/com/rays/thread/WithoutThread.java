
package com.rays.thread;

public class WithoutThread {

	public String name;
	
	public WithoutThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i =1; i <= 5; i++) {
		
			System.out.println(i +"="+ name);
		}
	}
	}

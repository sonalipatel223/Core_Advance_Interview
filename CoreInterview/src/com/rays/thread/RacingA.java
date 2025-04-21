
package com.rays.thread;

public class RacingA extends Thread {

	String name;

	public static Account account = new Account();

	public RacingA(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			account.deposit(name, 1000);
		}

	}

}

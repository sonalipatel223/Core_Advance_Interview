package com.rays.thread;

public class Account {

	private int balance;
	
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}
	
	public /* synchronized */  void deposit(String name, int amt) {
	//synchronized(this) {
		int total = getBalance() + amt;
		
		setBalance(total);
		
		System.out.println(name + " "+ getBalance());
	}
		}
//}



//Is code me try-catch block aur exception handling ka use isliye kiya gaya hai
//kyunki Thread.sleep(200) method ek checked exception throw karta hai,
//jiska handle karna zaroori hai
//Jab bhi aap Thread.sleep() method ka use karte ho, 
//toh compiler aapse force karta hai ki ya toh exception handle karo 
//(try-catch ke through) ya method declaration me throws likho.


package com.rays.exception.custom;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		balance =balance+amount;
		//System.out.println(balnc);
	}

	public void withdraw(double amount) throws AccountException {
		
		if ((balance-amount) < 2000) {
			AccountException e = new AccountException("Amount is less.....");
			throw e;
		}else {
			balance = balance - amount;
		}
	}

}
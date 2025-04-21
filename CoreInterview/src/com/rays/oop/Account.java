package com.rays.oop;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public  void deposite(int amount) {
		//System.out.println("total balance" + balance);
		//System.out.println("Deposite Amount" + amount);
		balance = balance + amount;
		System.out.println("After Deposite amount " + balance);
	}

	public void withdrawl(int amount) {

		if ((balance - 2000) < amount) {
			System.out.println("low balance");
		} else {

			//System.out.println("Total balance " + balance);
			//System.out.println("Withdrawl amount " + amount);
			balance = balance - amount;
			System.out.println("After withDrawl Amount " + balance);

		}

	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(1200);
		ac.deposite(2200);
		ac.withdrawl(50);
		//ac.getBalance();
	}

}

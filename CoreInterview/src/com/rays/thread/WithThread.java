
package com.rays.thread;

public class WithThread  extends Thread{

	String name;
	
	public WithThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
		
			System.out.println(i+"="+name);
		}
	}
	public static void main(String[] args) {
		
		WithThread t1 = new WithThread("abc");
		WithThread t2 = new WithThread("xyz");
		
		t1.start();
		t2.start();
	}
}

//Jab start() method ko call kiya jata hai,
//to thread ka execution asynchronously begin hota hai. 
//Isse run() method execute hota hai. Thread apna kaam parallel execute karta hai, 
//matlab ki t1 aur t2 dono simultaneously apna task perform karte hain.

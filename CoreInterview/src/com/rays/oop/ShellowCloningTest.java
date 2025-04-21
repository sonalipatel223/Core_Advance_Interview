package com.rays.oop;

public class ShellowCloningTest {
	
	 //Java mein clone() method use hota hai kisi object ko clone karne ke liye.
	//shallow copy mein sirf references copy hote hain, naye objects create nahi hote. 
	
	public static void main(String[] args) throws CloneNotSupportedException {

		ShellowCloning s = new ShellowCloning();
		s.balance = 100;

		ShellowCloning s1 = (ShellowCloning)s.clone();
		//s ka cloned object s1 mein store ho jata hai
		s1.balance = 200;
		System.out.println(s.balance);
		System.out.println(s1.balance);
	}

}

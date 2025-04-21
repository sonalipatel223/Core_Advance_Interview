package com.rays.oop;

public class ShellowCloning implements Cloneable  {

	public int balance;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ek shallow copy banana is class ke object ka, jab  clone() method call
		// kiya jaayega.

		return super.clone();
	}

}
//Shallow copy ka matlab hai ek object ka exact duplicate banana, 
//lekin agar object ke andar references (e.g., arrays, objects) hain, 
//to unka reference hi copy hota hai, na ki unki actual value.
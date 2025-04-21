package com.rays.oop;

public class ExplicitTest extends Explicit {

	public ExplicitTest(String name) {
		super(name);
	}

	public static void main(String[] args) {

		ExplicitTest e = new ExplicitTest("Sonali");
	}

}

//jb hm ExplicitTest ka object bnate he tb 
// Unresolved compilation problem

// Parent class (Explicit) mein koi default constructor available nahi hai,
// aur child class (ExplicitTest)// ka constructor jab super(name) call karta
// hai,
// woh parent ke parameterized constructor ko theek se access nahi kar paata.
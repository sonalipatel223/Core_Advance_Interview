package com.rays.collection;

import java.util.Stack;

public class StackHoldings {
	public static void main(String[] args) {

		Stack s1 = new Stack();

		for (char a = 'a'; a <= 'z'; a++) {

			System.out.print(s1.push(a) + " ");
		}
		System.out.println();

		Stack s2 = new Stack();
		while (!s1.isEmpty()) {

			// Jab tak s1 empty nahi hota (!s1.isEmpty()), tab tak loop chalega.

			System.out.print(s2.push(s1.pop()) + " ");

			// s1.pop(): s1 ke top se ek element remove karta hai aur us element ko
			// s2.push() ke through s2 me add karta hai.
		}

		/*
		 * System.out.println(); while (!s2.isEmpty()) {
		 * System.out.print(s1.push(s2.pop()) + " "); }
		 */ 
		}

}
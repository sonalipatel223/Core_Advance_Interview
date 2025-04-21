package com.rays.string;

public class CountAccuraceOfaChar {

	public static void main(String[] args) { // Done

		String name = "Sonali Patel";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			String m = String.valueOf(name.charAt(i)); // Yeh method ch[i] character ko string mein convert karta hai.
			if (m.matches("a")) {
				count++;
			}
		}
		if (count > 0) {
			System.out.print("a:" + count);
		}

	}
}
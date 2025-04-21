package com.rays.string;

public class Reapeating {
	public static void main(String[] args) {
		String name = "lokkeshhol";
		int a = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			a++;
			for (int j = a; j < name.length(); j++) {
				if (ch == name.charAt(j)) {
					System.out.println(name.charAt(j));
				}
			}
		}
	}
}

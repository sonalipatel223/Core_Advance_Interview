package com.rays.string;

public class CountAccuranceOfArray {

	public static void main(String[] args) { // Done

		String[] n = { "abcd", "bcdas" };

		for (char a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (String s : n) {
				char[] ch = s.toCharArray();
				for (int i = 0; i < ch.length; i++) {

					if (a == ch[i]) {
						count++;
					}
				}

			}

			if (count > 0) {
				System.out.println(a+ " " + count);
				
			}

		}
	}
}
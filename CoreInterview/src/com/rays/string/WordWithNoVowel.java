package com.rays.string;

public class WordWithNoVowel {
	public static void main(String[] args) {
		String str = "google";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if ("aeiouAEIOU".indexOf(c) == -1) {
				
				System.out.println(c);

			}

		}

	}

}

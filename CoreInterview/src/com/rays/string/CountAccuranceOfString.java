package com.rays.string;

public class CountAccuranceOfString {

	public static void main(String[] args) { // Done

		String name = "Sonali Patel";
		String name1 = name.toLowerCase();
		
		for (char a = 'a'; a <= 'z'; a++) {
			
			int count = 0;
			for (int i = 0; i < name1.length(); i++) {

				if (a == name1.charAt(i)) {            // i means index

					count++;

				}

			}

			if (count > 0) {

				System.out.println(a + " " + count);

			}

		}

	}

}

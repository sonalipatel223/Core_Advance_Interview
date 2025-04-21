package com.rays.string;

public class VowelsCount {

	public static void main(String[] args) {          // Done

		String str = "Guogle";
		
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			int count = 0;
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
				System.out.println(c + " : " + count);

			}

		}
		//System.out.println("No of vowel : " + count);
		
	}
}
		
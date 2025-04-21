package com.rays.string;

public class VowelCountSB {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("Introduction");
		
		int count =0;
		for(int i=0; i<sb.length(); i++) {
			char ch = sb.charAt(i);
			
			if(ch == 'a'|| ch =='e'||ch == 'i'|| ch =='o'||ch == 'u'||
					ch =='A'||ch == 'E'|| ch =='I'||ch == 'O'|| ch =='U') {
				
				count++;
				
			}
				
		}
		System.out.println("No of vowel : " + count);

	}

}

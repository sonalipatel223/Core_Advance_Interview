package com.rays.string;

public class DuplicateString {
	
	public static void main(String[] args) {                 //Done
		
		String name = "sagar patidar";
		
		char ch[]=name.toCharArray();
		 int count = 0;
		for(int i =0;i<ch.length;i++){ 
			 count = 1;
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=0;
				}
				
			}
			if(count>1 && ch[i] !=0) {
				System.out.println(ch[i]);
			}
		}
			
		
//		for(char c :ch) {
//			int count=0;
//			for (int i = 0; i < ch.length; i++) {
//				if(ch[i]==c) {
//					count++;
//					ch[i] = 0;
//				}
//				
//			}
//			if(count>1 && c != 0) {
//				System.out.println(c + " " + count);
//			}
//		}
//		
	}

	}


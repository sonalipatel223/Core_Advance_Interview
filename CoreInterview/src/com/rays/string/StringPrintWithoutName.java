package com.rays.string;

public class StringPrintWithoutName {
	public static void main(String[] args) {                  //Done
		String name = "sagar";
		
		for(char a='a'; a<='z'; a++) {
			if(name.indexOf(a)== -1) {
				
				System.out.println(a);
			}
		}
	}

}	
		
		
//		char ch[] = name.toCharArray();
//		
//		for(char a ='a';a<='z';a++) {
//			int count = 0;
//			for(char s : ch) {
//				if(s== a) {
//					count++;
//				}
//			} 
//			if(count==0) {
//				System.out.println(a);
//			}
//		}
//	}
//
//}

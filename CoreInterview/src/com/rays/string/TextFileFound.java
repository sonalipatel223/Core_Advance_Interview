 package com.rays.string;

public class TextFileFound {
	public static void main(String[] args) {                  //Done
		String[] arr = {"hello.txt", "hindi.txt","abc.python", "hello.java"};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].endsWith(".java")) {
				System.out.println(arr[i]);
			}
			
		}
	}

}

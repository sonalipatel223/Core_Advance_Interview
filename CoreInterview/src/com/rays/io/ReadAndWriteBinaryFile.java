package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		
		String source = "C:\\Users\\adity\\OneDrive\\Desktop\\IO\\image222.jpg";
		String target = "C:\\Users\\adity\\OneDrive\\Desktop\\IO\\input.jpg";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		int ch;
		
		while((ch = in.read())!= -1) {
			out.write(ch);
		}
		System.out.println("success");
	}
}

//in.read(): File se ek byte read karta hai aur uska integer representation return karta hai.
//Agar file end ho gayi hai, toh yeh -1 return karta hai.
//out.write(ch): Read kiya hua byte destination file mein likhta hai.


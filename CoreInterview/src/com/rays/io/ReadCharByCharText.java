package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {

	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\scanner.txt");

		int ch = file.read();
		
		while(ch != -1) {
			System.out.print((char)ch);
			
			ch = file.read();
		}
		
		file.close();
	}
}


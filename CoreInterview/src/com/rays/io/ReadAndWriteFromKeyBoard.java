package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadAndWriteFromKeyBoard {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = new FileWriter("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\sp.txt",true);
		
		System.out.println("enter here");
		
		String str = br.readLine();
		
		while(str != null && !str.equalsIgnoreCase("exit")) {
			fw.write(str);
			
			System.out.println(str);
			str = br.readLine();
		}
		fw.flush();
		fw.close();
		br.close();
		
	}
}



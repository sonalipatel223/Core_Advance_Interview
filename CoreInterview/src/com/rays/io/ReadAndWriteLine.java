package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWriteLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Ram.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Shyam.txt"));

		String str = br.readLine();
		while (str != null) {
			pw.write(str);
			System.out.println(str);
			str = br.readLine();
		}
		pw.close();
		br.close();

	}

}

package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineText {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\IO\\scanner.txt");

		BufferedReader br = new BufferedReader(fr);

		String str = br.readLine();

		while (str != null) {
			System.out.println(str);

			str = br.readLine();
		}

		fr.close();
		br.close();
	}
}


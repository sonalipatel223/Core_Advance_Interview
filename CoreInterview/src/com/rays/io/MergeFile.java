package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\ReadFileMult1.txt"));

		FileWriter fw = new FileWriter("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\WriteTwoFileDatas.txt");
		
		String s1 = br.readLine(); // Read the first line

		while (s1 != null) { // Loop until the end of the file

			fw.write(s1 + "\n"); // Write the line to naman.txt

			s1 = br.readLine(); // Read the next line
		}
		br.close(); // Close the reader for pranav.txt

		br = new BufferedReader(new FileReader("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\ReadFileMult2.txt"));

		String s2 = br.readLine(); // Read the first line

		while (s2 != null) { // Loop until the end of the file

			fw.write(s2 + "\n"); // Write the line to naman.txt

			s2 = br.readLine(); // Read the next line
		}
		br.close(); // Close the reader for nikki.txt
		fw.close();

		System.out.println("success ....");
	}
}

//FileReader: File ko read karne ke liye.
//BufferedReader: File ke content ko line-by-line read karne ke liye (efficiently).
//FileWriter: File mein content likhne ke liye.

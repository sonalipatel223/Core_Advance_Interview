package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileLineByLine {

	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\SN.txt");

		PrintWriter out = new PrintWriter(file);

		out.println("Sonali");

		out.println("Patel");

		out.close();

		file.close();

		System.out.println("data write successfully...!!!");
	}
}



//FileWriter: File mein data likhne ke liye use hota hai.
//PrintWriter: File mein formatted text (like line-by-line) likhne ke liye use hota hai.
//IOException: Agar file handling mein koi error aaye toh use handle karne ke liye.


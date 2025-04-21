package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileTest {

	public static void main(String[] args) throws IOException {

		String s = "C:\\Users\\adity\\OneDrive\\Desktop\\IO\\split.txt";

		int count = 0;
		int nol = 2;

		File file = new File(s);

		Scanner sc = new Scanner(file);

		while(sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		
		System.out.println("No of line " + count);
		
		int temp = count/nol;
		int rem = count%nol;
		int nof = temp;
		
		if(rem != 0) {
			nof++;
		}
		
		System.out.println("No of files..."+ nof);
		
		BufferedReader br = new BufferedReader(new FileReader(s));
		
		String str;
		
		for (int i = 1; i <= nof; i++) {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Aftersplit.txt"+ i + ".txt"));
			
			for (int j = 1; j <= nol; j++) {
				
				str = br.readLine();
				if(str != null) {
					bw.write(str);
					
					if(j != nol) {
						bw.newLine();
					}
				}
			}
			bw.close();
			
		}
		br.close();
	}
}


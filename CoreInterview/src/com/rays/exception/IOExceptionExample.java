
package com.rays.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
	public static void main(String[] args) {
		try {

			FileReader reader = new FileReader("file.txt");
			int data;
			while ((data = reader.read()) != -1) {

				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		catch (IOException e) {
			System.out.println(e);
		}
	}

}

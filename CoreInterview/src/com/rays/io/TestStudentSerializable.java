package com.rays.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(20, "sona");

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Student.txt"));
		
		out.writeObject(s);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Student.txt"));
		
		s = (StudentSerializable) in.readObject();
		
		System.out.println(s);
	}
}
//Agar koi field transient hai (e.g., id), toh wo automatic skip ho jaati hai
//aur null ya 0 set hota hai.
// or agar tansient nahi he to vahi id print hogi........
//File se object deserialize karne ke baad, id ki value 0 hogi.


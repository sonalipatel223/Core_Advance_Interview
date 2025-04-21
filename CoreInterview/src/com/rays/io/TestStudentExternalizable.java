package com.rays.io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StudentExternalizable s = new StudentExternalizable(10, "sona");

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Externalizable.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\adity\\OneDrive\\Desktop\\IO\\Externalizable.txt"));

		s = (StudentExternalizable) in.readObject();

		//System.out.println(s);

		System.out.println(s.getId());
		System.out.println(s.getName());

		out.close();
		in.close();

	}
}


//ObjectOutputStream: Yeh stream use hoti hai object ko serialize karne ke liye.
//FileOutputStream: Serialize kiya hua object ek file mein store karta hai.
//FileInputStream: "Externalizable.txt" file se data ko input ke roop mein read karta hai.


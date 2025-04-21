package com.rays.wonewkeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialization implements Serializable {
    public void display() {
        System.out.println("Object created using deserialization");
    }

    public static void main(String[] args) {
        try {
            // Serialize the object
        	Deserialization original = new Deserialization();
            FileOutputStream fos = new FileOutputStream("deserialization.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();

            // Deserialize the object
            FileInputStream fis = new FileInputStream("deserialization.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Deserialization deserialized = (Deserialization) ois.readObject();
            ois.close();

            deserialized.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


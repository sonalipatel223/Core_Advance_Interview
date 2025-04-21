package com.rays.io;


import java.io.Serializable;

public class StudentSerializable implements Serializable {

	transient int id;             // change hota he 
	public String name;

	public StudentSerializable() {

	}
// default Constructor define kr skte he or nahi bhi.........
	
	public StudentSerializable(int id, String name) {

		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("id : " + id + "  name: "+ name + " ");
	}
}


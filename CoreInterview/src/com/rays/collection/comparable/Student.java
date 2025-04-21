
package com.rays.collection.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int salary;

	public Student(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Student o) {

		/*
		 * if (this.name.equals(o.name)) {
		 * 
		 * return this.id - o.id;
		 * 
		 * } else {
		 * 
		 * return this.name.compareTo(o.name);
		 * 
		 */
   
//		if (this.salary == o.salary) {
//			return 0;
//		} else if (this.salary > o.salary) {
//			return 1;
//		} else {
//			return -1;
//		}
		
		  if (this.name.equals(o.name)) {
	            return this.salary - o.salary;
	        }
	        return this.name.compareTo(o.name); 
	    }
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
}


package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class EqualHashCodeSet {
	
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e2 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e3 = new EqualHashCode(2, "patel", 100);
		EqualHashCode e4 = new EqualHashCode(3, "patel", 300);

		
	Set s = new HashSet();

	s.add(e2);
	s.add(e3);
	s.remove(e1);
	System.out.println(s);
			}
}

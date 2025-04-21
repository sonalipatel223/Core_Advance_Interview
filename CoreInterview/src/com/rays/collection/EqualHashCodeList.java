package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class EqualHashCodeList {

	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e2 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e3 = new EqualHashCode(2, "patel", 100);
		EqualHashCode e4 = new EqualHashCode(3, "patel", 300);

		List l = new ArrayList();

		l.add(e2);
		l.add(e3);
		
		l.remove(e1);
		System.out.println(l);

	}
}

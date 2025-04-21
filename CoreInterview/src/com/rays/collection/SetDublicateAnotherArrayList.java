package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDublicateAnotherArrayList {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(2);
		l.add(2);
		l.add(1);
		l.add(3);
		// l.add(2);

		Set unique = new HashSet();
		Set duplicate = new HashSet();
		for (Object o : l) {
			if (!unique.add(o)) {                // ! ka matlab not hota hai.
				duplicate.add(o);             // Agar add(o) ka result false hai (matlab value already exist karti hai),
			}	                                  // toh !false ban jayega true.
		}	                              // Iska matlab hai ki o ek duplicate value hai.

		List dupl = new ArrayList(duplicate);
		List uniq = new ArrayList(unique);

		System.out.println(l);
		System.out.println(uniq);
		System.out.println(dupl);
	}

}

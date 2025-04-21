package com.rays.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterator {
	public static void main(String[] args) {

		HashSet s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(500);
		
		Iterator it = s.iterator();
		//s.add(600);

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

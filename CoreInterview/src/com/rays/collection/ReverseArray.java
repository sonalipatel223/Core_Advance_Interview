package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(6);
		l.add(5);
		l.add(3);
		l.add(4);

		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		// Collections.sort(l, Collections.reverseOrder());
		// System.out.println(l);
	}

}

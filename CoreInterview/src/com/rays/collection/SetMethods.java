package com.rays.collection;

import java.util.HashSet;

public class SetMethods {
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		
		System.out.println(h.add(60));
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(10));
		System.out.println(h);
		System.out.println(h.containsAll(h));
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.remove(30));
		System.out.println(h);
		System.out.println(h.removeAll(h));
		System.out.println(h.retainAll(h));
		
		h.clear();
		System.out.println(h);
		

	}

}

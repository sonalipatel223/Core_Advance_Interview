package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l.get(2));
		System.out.println(l.add(60));
		System.out.println(l);
		System.out.println(l.indexOf(20));
		System.out.println(l.subList(1, 3));
		System.out.println(l.lastIndexOf(40));
		System.out.println(l.remove(2));
		System.out.println(l);
		System.out.println(l.set(3,70));
		System.out.println(l);
	}

}

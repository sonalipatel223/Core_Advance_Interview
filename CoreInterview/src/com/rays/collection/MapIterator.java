package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {
	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<>();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(400, "four");
		m.put(4, null);
		m.put(4, "shiv");
		for (Object o : m.entrySet()) {

			System.out.println(o);

		}

		for (Object o : m.values()) {

			System.out.println(o);

		}

		for (Object o : m.keySet()) {

			System.out.println(o);
		}
		
	for (Map.Entry<Integer, String> s : m.entrySet()) {
		System.out.println(s.getKey() + " " + s.getValue());
	}

	}
}

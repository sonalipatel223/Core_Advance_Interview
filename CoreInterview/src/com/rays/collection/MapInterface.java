package com.rays.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");

		System.out.println(m.get(2));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("d"));
        System.out.println(m);
		System.out.println(m.put(4,"g"));
		System.out.println(m);
		System.out.println(m.remove(5));
		System.out.println(m);
		System.out.println("+++++++++++++++++++++++++++++++++");

		TreeMap t = new TreeMap();

		t.put(1, "Shivanshi");
		t.put(2, "minnie");
		t.put(3, "preksha");
		t.put(4, "shivali");
		t.put(5, "pranshu");

		System.out.println(t.firstKey());
		System.out.println(t.get(3));
		System.out.println(t.size());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
		System.out.println(t.isEmpty());

		System.out.println("==============================================");

		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "kgn");
		l.put(2, "jtn");
		l.put(3, "indore");
		l.put(6, "shivanshi");
		l.put(5, "shiv");

		System.out.println(l.isEmpty());
		System.out.println(l.get(2));
		System.out.println(l.containsKey(3));
		System.out.println(l);
		System.out.println(l.containsValue("kgn"));
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.entrySet());
		System.out.println(l.keySet());
		System.out.println(l.values());
	}
}

package com.rays.collection;

import java.util.HashMap;

public class MapMethod {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		System.out.println(map.get(2));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(3));
		System.out.println(map);
		System.out.println(map.containsValue("d"));
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.put(1, "e"));
		System.out.println(map.remove(3));
		System.out.println(map);
	}

}

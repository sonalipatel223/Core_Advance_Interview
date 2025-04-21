package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class EqualHashCodeMap {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e2 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e3 = new EqualHashCode(2, "patel", 100);
		EqualHashCode e4 = new EqualHashCode(3, "patel", 300);

				
				Map m = new HashMap();

				m.put(e3, "three");
				m.put(e2, "two");
				m.put(e2, "two");

				m.remove(e1, "two");
				System.out.println(m);
	}

}

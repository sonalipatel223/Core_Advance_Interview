package com.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	public static void main(String[] args) {
		
		SortedMap s=new TreeMap();  //TreeMap iska ek implementation hai jo:
		                           // Keys ko ascending order me arrange karta hai (natural sorting order).
		s.put(1, "one");
		s.put(2, "two");
		s.put(3, "three");              // SortedMap ek interface hai aur TreeMap uska ek 
		s.put(5, "one");                 // implementation class hai. 
		s.put(5, "five");
		s.put(4, "four");
		
		System.out.println(s.tailMap(4));        //4 se large
		System.out.println(s.lastKey());           // largest
		System.out.println(s.firstKey());         // smallest
		
		System.out.println(s.entrySet());
		System.out.println(s.subMap(1, 4));
	}

}

package com.rays.stream.api;

import java.util.stream.Stream;

public class StreamToArray {
	public static void main(String[] args) {
		
		Stream<String> str = Stream.of("c", "b", "a");

		String[] st = str.toArray(e -> new String[e]);

		for (String s : st) {
			System.out.println(s);
		}
       // System.out.println(st[1]);
	}

}

//Stream.of() method ek static method hai jo directly stream create karta hai.
//toArray Method: Converts the stream elements into an array.
//e -> new String[e]: ek lambda expression hai jo stream ke size 
// ke hisaab se ek String array banata hai.










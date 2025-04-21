
package com.rays.stream.api;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		String[] str = { "sona", "mona", "rupa", "sona" };
		Stream<String> stream = Arrays.stream(str);
		stream.sorted().distinct().forEach(System.out::println);
	}

}

//sorted(): Stream ke elements ko ascending order mein sort karta hai.
//distinct(): Duplicate elements ko remove karta hai.
//forEach(System.out::println): Stream ke har element ko print karta hai.

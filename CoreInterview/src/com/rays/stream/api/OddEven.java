
package com.rays.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OddEven {
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 4, 5, 87, 9);
		l.stream().distinct().forEach(c -> {
			if (c % 2 == 0) {
				System.out.println(c + "even");
			} else {
				System.out.println(c + "odd");
			}
		});
	}
}
// forEach(c ->: Stream ke har element ko process karne ke liye forEach use kiya gaya.

/*
 * int[] arr = { 2, 1, 5, 5, 8, 10, 11 };
 * 
 * IntStream stream = Arrays.stream(arr);
 * 
 * stream.filter(e -> e < 11).distinct().sorted().forEach(e -> {
 * System.out.println(e); }); } }
 */


package com.rays.stream.api;

import java.util.Arrays;

public class MinMax {
	public static void main(String[] args) {
		int[] i = { 10, 12, 45, 25, 23 };
		Arrays.stream(i).min().ifPresent(e -> System.out.println(e));
		Arrays.stream(i).max().ifPresent(System.out::println);

		
	}

}

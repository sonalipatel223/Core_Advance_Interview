package com.rays.javabasic;

public class TwoNumberMissing {
	public static void main(String[] args) {

		int[] a = { 1, 2, 8,3, 4, 5 };
		int[] b = { 1, 2, 4 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;

				}
			}

			if (count == 0) {

				System.out.println(a[i]);
			}
		}

	}
}


package com.rays.exception;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		String[] a = { "Shivanshi", "Pranshu", "Sanu" };

		try {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[12]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println(e);

			// System.out.println(e.getMessage());

		}

	}

}

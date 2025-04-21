
package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExcept {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("mango");
		list.add("Banana");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Attempt to access next element when none exists
		try {
			System.out.println(it.next());
		} catch (NoSuchElementException e) {
			System.out.println(e);

		}
	}

}

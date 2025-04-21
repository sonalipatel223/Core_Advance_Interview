
package com.rays.exception.custom;

public class TestChecked {

	public static void main(String[] args)  {

		dad();

	}

	public static void dad() {

		try {
			mom();
		} catch (CheckedException e) {
			System.out.println(e);
		}

	}

	public static void mom() throws CheckedException {

		son();

	}

	public static void son() throws CheckedException {

		// CheckedException e = new CheckedException();

		throw new CheckedException();

	}
}

// checkedException me try catch mandatory hota he.........

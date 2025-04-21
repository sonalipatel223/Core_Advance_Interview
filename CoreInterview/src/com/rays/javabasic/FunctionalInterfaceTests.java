
//public class FunctionalInterfaceTests {
//
//	public static void main(String[] args) {
//
//		FunctionalInt f = new FunctionalInt() {
//			public int sum(int a, int b) {
//				return a + b;
//			}
//
//		};
//
//		int a = 20;
//		int b = 10;
//
//		System.out.println(f.sum(a, b));
//	}
//}

package com.rays.javabasic;

public class FunctionalInterfaceTests {
	public static void main(String[] args) {

		FunctionalInt f = new FunctionalInt() {
			public int sum(int a, int b) {
				return a + b;
			}

		};

		int a = 20;
		int b = 10;

		System.out.println(f.sum(a, b));
		FunctionalInt.multi(a, b); // static method call a class name
		f.sub(a, b); // default method call a class name object

	}
}

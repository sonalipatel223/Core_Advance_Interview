package com.rays.oop.abstract1;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.area();
		r.hello();

		Shape s = new Shape() {

			@Override
			public void area() {
				System.out.println("this is shape");

			}
		};
		s.area();
		s.hello();

		Circle c = new Circle() {

			@Override
			public void area() {
				System.out.println("this is circle method");
			}
		};

		c.area();
	}
}

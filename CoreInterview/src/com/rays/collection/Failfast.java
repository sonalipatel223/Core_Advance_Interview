package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Failfast {
	public static void main(String[] args) {
		List l = new ArrayList();
		 //ArrayBlockingQueue l = new ArrayBlockingQueue(5); // Exception Not raise
		l.add(1);
		l.add(2);
		l.add(3);

		Iterator it = l.iterator();
     	l.add(5);
        l.add("abc");

		// l.add(4); // Here we cannot add or remove elements when list object
		// ArrayBlockingQueue l = new ArrayBlockingQueue(5); me 5 pass kiya he esliye 5
		// value hi add hogi or  5 se jada value add krenge to IllegalStateException aayegi

		// l.clear(); // Here we clear

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

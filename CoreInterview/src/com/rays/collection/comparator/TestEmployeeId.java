package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeId {
	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(new Employee("d", 3, 2000));
		l.add(new Employee("g", 1, 1000));
		l.add(new Employee("b", 2, 3000));
		l.add(new Employee("c", 1, 5000));
		l.add(new Employee("a", 5, 2000));

		EmployeeShortById byId = new EmployeeShortById();
		Collections.sort(l, byId);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

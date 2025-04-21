package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeSalary {
	public static void main(String[] args) {

		EmployeeShortBySalary bySalary = new EmployeeShortBySalary();
		List l = new ArrayList();

		l.add(new Employee("g", 3, 2000));
		l.add(new Employee("a", 1, 1000));
		l.add(new Employee("b", 2, 3000));
		l.add(new Employee("c", 1, 5000));
		l.add(new Employee("a", 5, 2000));

		Collections.sort(l, bySalary);

		Iterator i = l.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}

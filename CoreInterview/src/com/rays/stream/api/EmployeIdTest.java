
package com.rays.stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeIdTest {
	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList();
		l.add(new Employee(1, "kapil"));
		l.add(new Employee(4, "raj"));
		l.add(new Employee(2, "paras"));
		l.add(new Employee(8, "jatin"));

		l.stream().sorted(Comparator.comparingInt(Employee::getId))
				.forEach(e -> System.out.println(e.getId() + " =" + e.getName()));
	}

}

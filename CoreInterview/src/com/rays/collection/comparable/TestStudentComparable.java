
package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudentComparable {
	public static void main(String[] args) {
		
		List list = new ArrayList();

		list.add(new Student(4, "s",40000));
		list.add(new Student(2, "c",5000));
		list.add(new Student(3, "e",9000));
		list.add(new Student(1, "s",10000));

		Collections.sort(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

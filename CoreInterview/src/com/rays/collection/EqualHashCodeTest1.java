package com.rays.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e2 = new EqualHashCode(100, "sona", 500);
		EqualHashCode e3 = new EqualHashCode(2, "patel", 100);
		EqualHashCode e4 = new EqualHashCode(3, "patel", 300);

		if (e1.equals(e2)) {
			if (e1.hashCode() == e2.hashCode()) {

				System.out.println(e1.equals(e2));
				System.out.println(e1.hashCode());
				System.out.println(e2.hashCode());

				List l = new ArrayList();

				// l.add(e1);
				l.add(e2);
				System.out.println(l);
				l.add(e3);
				l.remove(e1);
				System.out.println(l);

				System.out.println("==========");

				Set s = new HashSet();

				// s.add(e1);
				s.add(e2);
				System.out.println(s);

				s.add(e3);
				s.remove(e1);
				System.out.println(s);
				System.out.println("==+++++++++==");

				Map m = new HashMap();

				m.put(e3, "three");
				m.put(e2, "two");
				m.put(e2, "two");
				System.out.println(m);

				m.remove(e1, "two");
				System.out.println(m);
			}
		}
	}
}

// map mein duplicate id keys allow nahi hoti
// Key unique hoti hai aur value duplicate ho sakti hai.
// agar 2 value same hoti he to map print nhi krta double value

//List duplicates allow karta hai aur objects ko as-is store karta hai.
// e1 and e2 ka hashcode same he but e2 ko add nhi kiya hmne
//but e2 ko remove kr rhe he to e1 ka data remove ho jayega
//kyoki inka hashcode same he.....

//Set duplicates allow nahi karta.

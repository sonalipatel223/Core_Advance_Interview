
package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderCustomDate {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2024, Calendar.MARCH, 04);
		for (int i = 1; i <= 12; i++) {
			
			  c.add(Calendar.DATE, 30);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println(sdf.format(c.getTime()));
	}

}
}











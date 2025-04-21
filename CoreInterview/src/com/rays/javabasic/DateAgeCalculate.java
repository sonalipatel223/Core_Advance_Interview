package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();

		LocalDate date1 = LocalDate.of(2002, 03 , 24);

		Period p = Period.between(date1, date);

		System.out.println("employe age : " + p.getYears());
	}

}

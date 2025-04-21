package com.rays.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarS {
    public static void main(String[] args) throws ParseException {
        
        String str = "08-05-2024";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        
        c.setTime(sdf.parse(str));
        
        for (int i = 0; i < 5; i++) {
            c.add(Calendar.DATE, 30);
            System.out.println(sdf.format(c.getTime()));
        }
    }
}
package com.rays.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        
        String str = "08-05-2024";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        
//        Date date = sdf.parse(str);
//        c.setTime(date);
        
        c.setTime(sdf.parse(str));
        
        for (int i = 0; i <=4; i++) {
            c.add(Calendar.DATE, 30);
            Date date2=c.getTime();
            System.out.println(new java.sql.Date(date2.getTime()));
            
        }
    }
}
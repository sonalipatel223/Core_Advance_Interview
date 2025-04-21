package com.rays.wonewkeyword;

import java.util.Calendar;

public class FactoryMethods {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Object created using factory method: " + calendar.getTime());
    }
}

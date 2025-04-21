package com.rays.wonewkeyword;

import java.lang.reflect.Constructor;

public class UsingReflection  {
    public void display() {
        System.out.println("Object created using Constructor.newInstance()");
    }

    public static void main(String[] args) {
        try {
            Constructor<UsingReflection> constructor = UsingReflection.class.getDeclaredConstructor();
            UsingReflection usingReflection = constructor.newInstance();
            usingReflection.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

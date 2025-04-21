  package com.rays.string;

public class StringAllMethods {

    public static void main(String[] args) {                //Done
        String name = "vikash";
        String str = "sachin";
       

		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("p"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.replace("v", "k"));
		System.out.println(name.concat(str));
		System.out.println(str.trim());
        System.out.println(name.substring(2));
        System.out.println(name+" "+str);
        System.out.println("Trimmed string: " + str.trim());

        String str1 = "hellow java";
        String[] s = str1.split(" ");
        for (String s1 : s) {
            System.out.print("---gfdtdftfd:---" + s1);
        }
        
       

    }

}

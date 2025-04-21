
package com.rays.networking;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReadPractice {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host Name: " + url.getHost());
        System.out.println("Port Number: " + url.getPort());
        System.out.println("File Name: " + url.getFile());

        InputStream in = url.openStream();

        Scanner sc = new Scanner(in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);
        }

        sc.close();
    }
}

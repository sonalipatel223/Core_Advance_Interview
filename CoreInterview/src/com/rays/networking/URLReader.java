
package com.rays.networking;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

    public static void main(String[] args) throws Exception {
        // Using a simpler URL that doesn't require special headers or authentication
        URL u = new URL("https://erp.sunilos.com/NCSA/#/Test");

        System.out.println("Protocol: " + u.getProtocol());
        System.out.println("Host Name: " + u.getHost());
        System.out.println("Port Number: " + u.getPort());
        System.out.println("File Name: " + u.getFile());

        // Open a stream to read from the URL
        InputStream in = u.openStream();

        // Use a Scanner to read the content line by line
        Scanner sc = new Scanner(in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);
        }

        // Close the Scanner
        sc.close();
    }
}

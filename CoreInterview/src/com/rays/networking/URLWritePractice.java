
package com.rays.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWritePractice {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

		String question = "java";

		URLConnection conn = url.openConnection();

		conn.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		out.write("q=" + question);

		out.close();

		conn.connect();

		InputStream in = conn.getInputStream();

		Scanner sc = new Scanner(in);

		System.out.print("URL contents ***");

		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(s);
		}

		sc.close();

	}

}


package com.rays.networking;

import java.io.*;
import java.net.*;

public class HelloTCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(1235);

		System.out.println("Server started. Waiting for a client...");

		Socket client = serverSocket.accept();
		System.out.println("Client connected.");

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hello Client\n");

		String line = in.readLine();
		System.out.println("Received from client: " + line);

		client.close();
		serverSocket.close();
		System.out.println("Server closed.");
	}
}

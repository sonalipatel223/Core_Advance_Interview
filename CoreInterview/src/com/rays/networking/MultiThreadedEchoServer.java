
package com.rays.networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedEchoServer extends Thread {
	public Socket client = null;

    public MultiThreadedEchoServer(Socket clientSocket) {
        this.client = clientSocket;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("Server received: " + line);
                out.println(line + " .. " + line);

                if ("Bye".equalsIgnoreCase(line)) {
                    break;
                }
            }

            out.close();
            in.close();
            client.close();
        } catch (Exception e) {
            System.err.println("IOException in client communication: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        boolean isRunning = true;

        try {  
            serverSocket = new ServerSocket(5643);
            System.out.println("Echo Server Started on port 5643");
          
            while (isRunning) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());

                MultiThreadedEchoServer echoServer = new MultiThreadedEchoServer(clientSocket);
                echoServer.start();
            }

        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("Could not close server socket: " + e.getMessage());
                }
            }
        }

        System.out.println("Echo Server Stopped");
    }
}


//Yeh line Java mein error handling ke liye use ki gayi hai.Iska kaam hai agar client ke
//communication ke dauraan koi IOException aaye,toh us error ka message console par print kare.

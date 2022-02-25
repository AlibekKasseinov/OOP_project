package com.javaoop;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    /* Localization of the server side of the Server class */

    public static void main(String[] args) throws IOException {

        while (true)
            try (ServerSocket server = new ServerSocket(8000)) //Creating a Socket server
        { System.out.println("Server started!");
            try (

                    Socket socket = server.accept(); //creating and saving a connection

                    BufferedWriter writer =
                            new BufferedWriter(
                                    new OutputStreamWriter(
                                            socket.getOutputStream()));
                    BufferedReader reader =
                            new BufferedReader (
                                    new InputStreamReader (
                                            socket.getInputStream()));
            ) {
                String request = reader.readLine();
                System.out.println("Request" + request);
                String response = "Hello from Server" + request.length();
                System.out.println("Response " + response);
                writer.write(response);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

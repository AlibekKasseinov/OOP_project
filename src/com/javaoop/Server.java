package com.javaoop;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    /* Localization of the server side of the Server class */

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(port:8000); //Creating a Socket server
        System.out.println("Server started!");

        Socket socket = server.accept(); //creating and saving a connection
        System.out.println("Client connected");

        BufferedWriter writer =
                new BufferedWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream()));

        writer.write("Hello from Server");
        writer.newLine();
        writer.flush();

        writer.close();
        socket.close();
        server.close();
    }
}

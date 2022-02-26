package com.javaoop;

import phonepackage.Telephone;

import java.io.*;
import java.net.ServerSocket;


public class Server {

    /* Localization of the server side of the Server class */

    public static void main(String[] args) throws IOException {
            try (ServerSocket server = new ServerSocket(8000)) //Creating a Socket server
        { System.out.println("The server is running");

            while (true)
                try (Telephone telephone = new Telephone(server)){
                String request = telephone.readLine();
                System.out.println("Request from: " + request);
                String response = Math.random() * 30 - 10 + "";
                telephone.writeLine(response);
                System.out.println("Response: " + response);
            }catch (NullPointerException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

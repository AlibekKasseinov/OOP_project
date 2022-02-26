import phonepackage.Telephone;

import java.io.*;

// making class Client, which making request for server
public class Client {
    public static void main(String[] args) {

        try (Telephone telephone = new Telephone("127.0.0.1", 8000)){

            System.out.println("Connected to server");
            String request = "Nur-Sultan";
            System.out.println("Request: " + request);
            telephone.writeLine(request);

            String response = telephone.readLine();
            System.out.println("Response: " + response );

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


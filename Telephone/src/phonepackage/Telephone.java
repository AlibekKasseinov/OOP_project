package phonepackage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Telephone {

    private final Socket socket;
    private final BufferedReader reader;
    private final BufferedWriter writer;


    public Telephone(Socket socket){
            this.socket = socket;
            this.reader = createReader();
            this.writer = createWriter();
    }

    public Telephone(ServerSocket socket){
        this.socket = server.accept();
        this.reader = createReader();
        this.writer = createWriter();
    }
    private BufferedReader createReader(){


        try {
            return new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
    private BufferedWriter createWriter(){
        try {
            return new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}

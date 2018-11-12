package com.exia.trip.model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class EngineCom {

    private static final String HOST = "localhost";
    private static final int PORT = 9999;

    private static EngineCom engine;

    private Socket socket;
    private Model model;

    private EngineCom(){
        this.socket = this.initSocket();
    }

    public static EngineCom getInstance(){
        if(engine == null){
            engine = new EngineCom();
        }
        return engine;
    }

    private Socket initSocket(){
        Socket socket = null;
        try {
            socket = new Socket(this.HOST,this.PORT);
        } catch (UnknownHostException e2){
            e2.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        }
        return socket;
    }

    public void ListenSocket(Model model){
        this.model = model;
        Runnable task = () -> {
                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    while(true){
                        String in = stdIn.readLine();
                        if(in != null)
                        {
                            this.model.addCup();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        };
        Thread listener = new Thread(task);
        listener.start();
    }
}

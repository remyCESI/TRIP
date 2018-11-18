package model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class EngineCom extends Thread {

    private static final String HOST = "localhost";
    private static final int PORT = 9999;

    private static EngineCom engine;

    private ServerSocket server;
    private Socket socket;
    private Model model;

    private EngineCom(Model model){
        try {
            this.model = model;
            server = new ServerSocket(PORT,1,Inet4Address.getByName(HOST));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static EngineCom getInstance(Model model){
        if(engine == null){
            engine = new EngineCom(model);
        }
        return engine;
    }

    @Override
    public void run(){
        socket = null;
        try {
            socket = server.accept();
            this.ListenSocket();
        } catch (UnknownHostException e2){
            e2.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        }
    }

    public void ListenSocket(){
        Runnable task = () -> {
                try {
                    BufferedReader stdIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    boolean exit = false;
                    while(!exit) {
                        String in = stdIn.readLine();
                        if (in != null) {
                            this.model.addCup();
                        } else {
                            System.out.println("close connection");
                            socket.close();
                            exit = true;
                            this.run();
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

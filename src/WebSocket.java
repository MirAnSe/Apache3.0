import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebSocket {

    ServerSocket serverSocket;

    public WebSocket(int port){

        try {
            System.out.println("Start Apache 3.0");
            serverSocket = new ServerSocket(port);
        }catch (IOException ioe){
            System.out.println("IOE "+ioe);
        }

    }

    public void startServer(){
        try {
            while(true){
                Socket webClientSocket = serverSocket.accept();
                WebClient webClient = new WebClient(webClientSocket);
                System.out.println(webClientSocket);
            }
        }catch (IOException ioe){
            System.out.println("IOE "+ioe);
        }
    }
}

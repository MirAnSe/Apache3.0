import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        WebSocket webSocket = new WebSocket(80);
        webSocket.startServer();
    }
}

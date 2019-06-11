import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class WebClient implements Runnable {

    private Thread thread;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private BufferedOutputStream dataOut;


    public WebClient(Socket socket){
        this.socket=socket;
        thread = new Thread(this);
    }

    public void run(){
        try{
            
        }catch (IOException ioe){

        }
    }

}

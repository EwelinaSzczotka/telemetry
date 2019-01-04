package telemetry;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class ServerConnection {
    
    private final String address = "192.168.56.1";
    private final int port = 65432;
    
    private Socket socket;
    //private OutputStream outputStream;
    private DataInputStream is;
    private DataOutputStream os;

    
    public void connectToServer(){
        
        try{
            socket = new Socket(address,port);    
            //outputStream = new ByteArrayOutputStream();
            is = new DataInputStream(socket.getInputStream());
            os = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public void disconnect(){
        try{
            socket.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void sendData() {
        try {
            byte[] buf = new byte[4];
            os.write(buf);
            System.out.println("Data sent");
            
            int count = is.available();
            byte[] input = new byte[count];
            is.read(input);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    
}

package socketPgm;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class myServer {
    public static void main (String[] args) throws IOException{
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = (String) din.readUTF();
            System.out.println("message" + str);
            ss.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}

package socketPgm;

import java.io.DataOutputStream;
import java.net.Socket;

public class myClient {
    public static void main(String[] args){
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello server mama");
            dout.flush();
            dout.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

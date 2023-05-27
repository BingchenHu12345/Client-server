
// SERVER

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Network
{
    public static void main(String[] args)
    {
        //socket to host server
        try(ServerSocket serverSocket=new ServerSocket(8111)){
            System.out.println("You are on port 8111");
            while(true)
            {
                //accepting client and storing
                Socket socket=serverSocket.accept();
                System.out.println("YOU CONNECTED");
                //get ability to send data thru socket
                OutputStream os=socket.getOutputStream();
                //taking output stream and making it a printable object
                PrintWriter pw=new PrintWriter(os,true);


                InputStream is=socket.getInputStream();
                BufferedReader r=new BufferedReader(new InputStreamReader(is));


                pw.println("HI543654356465");

                System.out.println(r.readLine());

                //disconnecting the client
                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


// SERVER

import common.packets.Packet;

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
                //taking output stream and making it a printable object

                OutputStream os=socket.getOutputStream();
                ObjectOutputStream oos=new ObjectOutputStream(os);

                Packet packet=new Packet(6);

                oos.writeObject(packet);

                InputStream is=socket.getInputStream();
                ObjectInputStream ois=new ObjectInputStream(is);


//                BufferedReader r=new BufferedReader(new InputStreamReader(is));




                //disconnecting the client
                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

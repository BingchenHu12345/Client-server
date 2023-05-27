//CLIENT


import common.packets.Packet;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args)
    {
        //variables/ connection settings
        String hostname="localhost";
        int port=8111;
        //Connecting blok
        try(Socket socket = new Socket(hostname, port)){
            //get ability to recieve the dattaaa
            InputStream is=socket.getInputStream();
            ObjectInputStream ois=new ObjectInputStream(is);

            OutputStream os=socket.getOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(os);
//            PrintWriter pw=new PrintWriter(os,true);

            // convert socket to reading form
//            BufferedReader r = new BufferedReader(new InputStreamReader(is));

            Packet recPacket= (Packet) ois.readObject();

            System.out.println(recPacket.num);


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


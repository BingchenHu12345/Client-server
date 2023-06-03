//CLIENT


import common.packets.Packet;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

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
            int count =0;
            Scanner sc = new Scanner(System.in);
            System.out.println("whats your name");

            String name=sc.nextLine();
            while(true) {
                Packet recPacket = (Packet) ois.readObject();

                System.out.println(recPacket);

                System.out.println("Write back");
                String respond = sc.nextLine();
                count+=1;
                Packet packet = new Packet(count,name , new Date(), respond);

                oos.writeObject(packet);
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}


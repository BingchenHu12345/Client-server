//CLIENT


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

            OutputStream os=socket.getOutputStream();
            PrintWriter pw=new PrintWriter(os,true);

            // convert socket to reading form
            BufferedReader r = new BufferedReader(new InputStreamReader(is));
            System.out.println(r.readLine());

            pw.println("vjhvghvbjknbhgvfcdxsfcgvh");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
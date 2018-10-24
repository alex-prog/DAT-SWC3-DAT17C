package week39.udpex;


import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created by coag on 27-09-2018.
 */
public class UDPSend {

    public static void main(String[] args) {

        final int PORT_IN = 5656;
        final int PORT_OUT = 5657;
        final String IP_NAME = "127.0.0.1";

        try {

            DatagramSocket socket = new DatagramSocket(PORT_IN);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("What do you want to send?");
                String msg = sc.nextLine();
                //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
                byte[] data = msg.getBytes();

                //localhost
                //127.0.0.1
                //168.153.23.2
                //0.0.0.0
                //4a:3f:56:....
                InetAddress address = InetAddress.getByName(IP_NAME);
                DatagramPacket packet = new DatagramPacket(data, data.length, address, PORT_OUT);

                socket.send(packet);
                System.out.println("Done!!!!");
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

package week39.udpex;

import java.io.IOException;
import java.net.*;

/**
 * Created by coag on 27-09-2018.
 */
public class UDPRecive {


    public static void main(String[] args) {

        final int PORT_IN = 5657;
        final int PORT_OUT = 5656;
        final String IP_NAME = "127.0.0.1";

        try {
            DatagramSocket socket = new DatagramSocket(PORT_IN);
            InetAddress address = InetAddress.getByName(IP_NAME);

            String msg = "";
            do {
                byte[] data = new byte[1024];

                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                msg = new String(data).trim();
                System.out.println(msg);
            } while (!msg.equalsIgnoreCase("#die"));

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}

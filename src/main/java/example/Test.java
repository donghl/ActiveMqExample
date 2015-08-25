package example;

import java.net.*;
public class Test {
   public static void main(String[] args) throws Exception {
        String ip = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip);
   }
}
package example;

import java.net.*;
public class Test {
   public static void main(String[] args) throws Exception {
        String ip = InetAddress.getLocalHost().getHostAddress();
        InetAddress[] ip1 = InetAddress.getAllByName(InetAddress.getLocalHost().getHostName()); 
        System.out.println(ip);
        for(InetAddress ipaddress :ip1)
        {
        	System.out.println(ipaddress.getHostAddress());
        }
        
   }
}
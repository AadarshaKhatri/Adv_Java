package org.example.models;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Network {
    public static void main(String[] args) throws UnknownHostException {
        String url = " www.simplilearn.com";
        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("Adress:"+ Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host Adress: " + (inetAddress.getHostAddress()));

    }
}

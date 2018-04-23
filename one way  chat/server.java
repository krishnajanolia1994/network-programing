/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author guest-TaoskR
 */
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("server starte");
            ServerSocket ss=new ServerSocket(9999);
            Socket s=ss.accept();
            BufferedReader br=new 
            BufferedReader(new InputStreamReader(s.getInputStream()));
            String st=br.readLine();
            System.out.println(st);
    }
    
}

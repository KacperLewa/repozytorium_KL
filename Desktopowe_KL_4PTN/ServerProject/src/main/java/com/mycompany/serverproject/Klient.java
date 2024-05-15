/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverproject;
import java.io.*;
import java.net.*;
import javax.swing.JButton;

/**
 *
 * @author kacpe
 */
public class Klient {
    public String host = "localhost";
    public int port = 9876;
    
    public void wyslij(JButton but, int x, int y){
        try (Socket socket = new Socket(host, port)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println(""+but.getName()+","+x+":"+y);
            System.out.println("Odpowiedź serwera: " + serverIn.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

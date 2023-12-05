/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notatnik;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author kacpe
 */
public class Conn {
    private String url = "jdbc:mysql://localhost:3306/notatnik";
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "root";
    private String dbpassword = "haslo";
    
    public ArrayList<Dane> con(String qr){
        ArrayList<Dane> tab = new ArrayList<>();
        try{
            Class.forName(driver);
            Connection c = DriverManager.getConnection(url,userName,dbpassword);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(qr);
            if(qr.contains("SELECT")){
                while(rs.next()){
                tab.add(new Dane(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
            }
            st.close();
            c.close();
            System.out.println("co jest");
            System.out.println(tab);
            
        }catch(Exception e){
            System.out.println(e);
        }
        return tab;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notatnik;

/**
 *
 * @author kacpe
 */
public class Dane {
    private int id;
    private String tytul;
    private String notka;
    private String data;
    private String kategoria;
    
    public Dane(int id, String tytul, String notka, String kategoria, String data){
        this.id = id;
        this.tytul = tytul;
        this.notka = notka;
        this.kategoria = kategoria;
        this.data = data;
    }
    
    public int getID(){
        return id;
    }
    
    public String getTytul(){
        return tytul;
    }
    
    public String getNotka(){
        return notka;
    }
    
    public String getData(){
        return data;
    }
    
    public String getKategoria(){
        return kategoria;
    }
    
}

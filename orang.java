/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author DELL
 */
public class orang {
     private String name;
    private double tinggi;
    private double berat;

    // Constructor untuk inisialisasi objek Orang
    public orang(String name, double tinggi, double berat) {
        this.name = name;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString() {
        return "Name: " + name + "\nTinggi: " + tinggi + "\nBerat: " + berat;
    }
}    
    
    
    
    


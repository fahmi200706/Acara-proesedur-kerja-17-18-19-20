/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author DELL
 */
public class pelajar extends orang {
    private String nim;
    private String asalSekolah;
    private double nilai;
    
     public pelajar(String name, double tinggi, double berat, String nim, String asalSekolah, double nilai) {
        super(name, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }
      public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nSekolah: " + asalSekolah + "\nNilai: " + nilai;
    }     
}

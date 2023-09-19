/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil08 m = new Mobil08();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        Sopir08 s = new Sopir08();
        s.setNama("John Doe");
        s.setBiaya(200000);

        Pelanggan08 p = new Pelanggan08();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
    }
}
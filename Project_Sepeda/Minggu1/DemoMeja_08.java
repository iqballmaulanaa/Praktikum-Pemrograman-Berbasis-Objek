/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
public class DemoMeja_08 {
    public static void main(String[] args) {
        // Instansiasi objek untuk setiap class
        Meja_08 meja = new Meja_08("Coklat", "Kayu");
        Hp_08 hp = new Hp_08("Samsung", "Galaxy S21", "S21-123", 8, 128);
        Kipas_08 kipas = new Kipas_08("Panasonic", "Kipas Angin", 3);
        MejaMakan_08 mejaMakan = new MejaMakan_08("Putih", "Kayu", 4);
        MejaLipat_08 mejaLipat = new MejaLipat_08("Hitam", "Aluminium", "Sedang");

        // Memanggil method pada setiap objek
        System.out.println("Informasi Meja:");
        meja.tampilData();
        meja.geser();

        System.out.println("\nInformasi HP:");
        hp.tampilData();
        hp.hidupkan();
        hp.matikan();

        System.out.println("\nInformasi Kipas:");
        kipas.tampilData();
        kipas.nyalakan();
        kipas.matikan();

        System.out.println("\nInformasi Meja Makan:");
        mejaMakan.tampilData();
        mejaMakan.geser();

        System.out.println("\nInformasi Meja Lipat:");
        mejaLipat.tampilData();
        mejaLipat.lipat();
        mejaLipat.buka();
    }
}
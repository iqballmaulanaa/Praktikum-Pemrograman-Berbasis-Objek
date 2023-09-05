/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
// Hp class
class Hp_08 {
    // Atribut
    private String merk;
    private String tipe;
    private String kode;
    private int ram;
    private int penyimpanan;

    // Constructor
    public Hp_08(String merk, String tipe, String kode, int ram, int penyimpanan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kode = kode;
        this.ram = ram;
        this.penyimpanan = penyimpanan;
    }

    // Method
    public void tampilData() {
        System.out.println("Merk HP: " + merk);
        System.out.println("Tipe HP: " + tipe);
        System.out.println("Kode HP: " + kode);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Penyimpanan: " + penyimpanan + " GB");
    }

    public void hidupkan() {
        System.out.println("HP dinyalakan.");
    }

    public void matikan() {
        System.out.println("HP dimatikan.");
    }
}
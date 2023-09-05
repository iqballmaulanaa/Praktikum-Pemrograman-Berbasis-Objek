/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
// Kipas class
class Kipas_08 {
    // Atribut
    private String merk;
    private String tipe;
    private int kecepatan;

    // Constructor
    public Kipas_08(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Method
    public void tampilData() {
        System.out.println("Merk Kipas: " + merk);
        System.out.println("Tipe Kipas: " + tipe);
        System.out.println("Kecepatan Kipas: " + kecepatan + " RPM");
    }

    public void nyalakan() {
        System.out.println("Kipas dinyalakan.");
    }

    public void matikan() {
        System.out.println("Kipas dimatikan.");
    }
}
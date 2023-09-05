/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
// Meja class
class Meja_08 {
    // Atribut
    private String warna;
    private String jenisBahan;

    // Constructor
    public Meja_08(String warna, String jenisBahan) {
        this.warna = warna;
        this.jenisBahan = jenisBahan;
    }

    // Method
    public void tampilData() {
        System.out.println("Warna Meja: " + warna);
        System.out.println("Jenis Bahan Meja: " + jenisBahan);
    }

    public void geser() {
        System.out.println("Meja digeser.");
    }
}
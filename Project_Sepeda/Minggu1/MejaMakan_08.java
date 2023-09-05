/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
// MejaMakan class (mewarisi Meja dan menambah atribut jumlahKursi)
class MejaMakan_08 extends Meja_08 {
    // Atribut tambahan
    private int jumlahKursi;

    // Constructor
    public MejaMakan_08(String warna, String jenisBahan, int jumlahKursi) {
        super(warna, jenisBahan); // Memanggil constructor Meja_08
        this.jumlahKursi = jumlahKursi;
    }

    // Method tambahan
    public void tampilData() {
        super.tampilData(); // Memanggil tampilData dari Meja_08
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }

    public void geser() {
        System.out.println("Meja Makan digeser.");
    }
}
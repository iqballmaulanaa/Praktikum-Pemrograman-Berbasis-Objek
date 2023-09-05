/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
// MejaLipat class (mewarisi Meja dan menambah atribut ukuranLipat)
class MejaLipat_08 extends Meja_08 {
    // Atribut tambahan
    private String ukuranLipat;

    // Constructor
    public MejaLipat_08(String warna, String jenisBahan, String ukuranLipat) {
        super(warna, jenisBahan); // Memanggil constructor Meja_08
        this.ukuranLipat = ukuranLipat;
    }

    // Method tambahan
    public void tampilData() {
        super.tampilData(); // Memanggil tampilData dari Meja_08
        System.out.println("Ukuran Lipat: " + ukuranLipat);
    }

    public void lipat() {
        System.out.println("Meja Lipat dilipat.");
    }

    public void buka() {
        System.out.println("Meja Lipat dibuka.");
    }
}
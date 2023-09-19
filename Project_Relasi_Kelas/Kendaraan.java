/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
class Kendaraan {
    private String nomorPolisi;
    private String merk;
    private int tahun;
    private double biayaSewaPerHari;

    public Kendaraan(String nomorPolisi, String merk, int tahun, double biayaSewaPerHari) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahun = tahun;
        this.biayaSewaPerHari = biayaSewaPerHari;
    }

    // Getter dan setter

    public String info() {
        String info = "";
        info += "Nomor Polisi: " + nomorPolisi + "\n";
        info += "Merk: " + merk + "\n";
        info += "Tahun: " + tahun + "\n";
        info += "Biaya Sewa per Hari: " + biayaSewaPerHari + "\n";
        return info;
    }
    
    public double getBiayaSewaPerHari() {
    return biayaSewaPerHari;
    }
}
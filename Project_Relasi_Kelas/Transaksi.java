/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
class Transaksi {
    private Kendaraan kendaraan;
    private Penyewa penyewa;
    private String tanggalSewa;
    private int lamaSewa;

    public Transaksi(Kendaraan kendaraan, Penyewa penyewa, String tanggalSewa, int lamaSewa) {
        this.kendaraan = kendaraan;
        this.penyewa = penyewa;
        this.tanggalSewa = tanggalSewa;
        this.lamaSewa = lamaSewa;
    }

    // Getter dan setter

    public double hitungBiayaSewa() {
        return kendaraan.getBiayaSewaPerHari() * lamaSewa;
    }

    public String info() {
        String info = "";
        info += "Tanggal Sewa: " + tanggalSewa + "\n";
        info += "Lama Sewa (hari): " + lamaSewa + "\n";
        info += "Biaya Sewa: " + hitungBiayaSewa() + "\n";
        return info;
    }
}
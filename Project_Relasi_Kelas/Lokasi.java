/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
class Lokasi {
    private String namaLokasi;
    private ArrayList<Transaksi> daftarTransaksi;

    public Lokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
        daftarTransaksi = new ArrayList<>();
    }

    // Getter dan setter

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public ArrayList<Transaksi> daftarTransaksi() {
        return daftarTransaksi;
    }

    public String info() {
    String info = "";
    info += "Nama Lokasi: " + namaLokasi + "\n";
    info += "Daftar Transaksi:\n";
    for (Transaksi transaksi : daftarTransaksi) {
        info += transaksi.info() + "\n";
    }
    return info;
    }
}
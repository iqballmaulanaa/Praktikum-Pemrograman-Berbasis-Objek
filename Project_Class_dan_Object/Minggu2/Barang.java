/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2;

/**
 *
 * @author USER
 */
public class Barang {
    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        float hargaDiskon = hargaDasar - (diskon / 100) * hargaDasar;
        return Math.round(hargaDiskon);
    }

    public void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: Rp " + hitungHargaJual());
    }

    public static void main(String[] args) {
        Barang barang1 = new Barang("B001", "Laptop", 10000000, 10.0f);
        Barang barang2 = new Barang("B002", "Smartphone", 5000000, 5.0f);

        System.out.println("Barang 1:");
        barang1.tampilData();

        System.out.println("\nBarang 2:");
        barang2.tampilData();
    }
}
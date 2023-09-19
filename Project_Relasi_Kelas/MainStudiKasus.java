/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
public class MainStudiKasus {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("B 1234 CD", "Toyota Avanza", 2022, 250000);
        Penyewa penyewa = new Penyewa("001", "John Doe");
        Transaksi transaksi = new Transaksi(kendaraan, penyewa, "2023-09-25", 3);

        Lokasi lokasi = new Lokasi("Kantor Rental XYZ");
        lokasi.tambahTransaksi(transaksi);

        System.out.println("Informasi Kendaraan:");
        System.out.println(kendaraan.info());

        System.out.println("\nInformasi Penyewa:");
        System.out.println(penyewa.info());

        System.out.println("\nInformasi Transaksi:");
        System.out.println(transaksi.info());

        System.out.println("\nInformasi Lokasi:");
        System.out.println(lokasi.info());
    }
}
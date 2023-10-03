/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz01_praktikumpbo;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama awal Nasabah: ");
        String namaAwal = scanner.nextLine();

        System.out.print("Masukkan nama akhir Nasabah: ");
        String namaAkhir = scanner.nextLine();

        System.out.print("Masukkan saldo awal Tabungan: ");
        int saldoAwal = scanner.nextInt();

        Tabungan tabunganNasabah = new Tabungan(saldoAwal);
        Nasabah nasabah = new Nasabah(namaAwal, namaAkhir);
        nasabah.setTabungan(tabunganNasabah);

        System.out.println("Nama Awal Nasabah: " + nasabah.getNamaAwal());
        System.out.println("Nama Akhir Nasabah: " + nasabah.getNamaAkhir());
        System.out.println("Saldo Tabungan: " + nasabah.getTabungan().getSaldo());
        System.out.print("Masukkan jumlah yang ingin disimpan: ");
        int jumlahSimpan = scanner.nextInt();
        nasabah.getTabungan().simpanUang(jumlahSimpan);
        System.out.println("Saldo Tabungan setelah menyimpan uang: " + nasabah.getTabungan().getSaldo());

        System.out.print("Masukkan jumlah yang ingin diambil: ");
        int jumlahAmbil = scanner.nextInt();
        boolean berhasilAmbil = nasabah.getTabungan().ambilUang(jumlahAmbil);
        if (berhasilAmbil) {
            System.out.println("Uang berhasil diambil. Saldo Tabungan sekarang: " + nasabah.getTabungan().getSaldo());
        } else {
            System.out.println("Uang tidak dapat diambil. Saldo Tabungan: " + nasabah.getTabungan().getSaldo());
        }

        scanner.close();
    }
}
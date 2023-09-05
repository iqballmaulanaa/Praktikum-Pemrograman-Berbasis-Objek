/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class TestPeminjaman_08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Menciptakan objek peminjam
    Peminjaman_08 peminjam = new Peminjaman_08();

    // Menerima input dari pengguna
    System.out.print("Masukkan ID Peminjaman: ");
    int id = input.nextInt();
    input.nextLine(); // Ini akan mengonsumsi newline character yang tersisa dari input sebelumnya
    System.out.print("Masukkan Nama Member: ");
    String namaMember = input.nextLine();
    System.out.print("Masukkan Nama Game: ");
    String namaGame = input.nextLine();
    System.out.print("Masukkan Harga per Hari: "); // Menambah input harga per hari
    int hargaPerHari = input.nextInt();
    System.out.print("Masukkan Lama Sewa (hari): ");
    int lamaSewa = input.nextInt();

    // Menyimpan input ke objek peminjam
    peminjam.setId(id);
    peminjam.setNamaMember(namaMember);
    peminjam.setNamaGame(namaGame);
    peminjam.setLamaSewa(lamaSewa);
    peminjam.setHarga(hargaPerHari); // Menyimpan harga per hari

    // Menampilkan data peminjam
    System.out.println("\n**Data Peminjaman**");
    peminjam.tampilData();
  }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2;

/**
 *
 * @author USER
 */
class Peminjaman_08 {
  int id08;
  String namaMember08;
  String namaGame08;
  int lamaSewa08;
  int harga08;

  void setId(int id) {
    this.id08 = id;
  }

  int getId() {
    return this.id08;
  }

  void setNamaMember(String namaMember) {
    this.namaMember08 = namaMember;
  }

  String getNamaMember() {
    return this.namaMember08;
  }

  void setNamaGame(String namaGame) {
    this.namaGame08 = namaGame;
  }

  String getNamaGame() {
    return this.namaGame08;
  }

  void setLamaSewa(int lamaSewa) {
    this.lamaSewa08 = lamaSewa;
  }

  int getLamaSewa() {
    return this.lamaSewa08;
  }

  void setHarga(int harga) {
    this.harga08 = harga;
  }

  int getHarga() {
    return this.harga08;
  }

  int hitungHarga() {
    return this.lamaSewa08 * this.harga08;
  }

  void tampilData() {
    System.out.println("ID Peminjaman: " + this.getId());
    System.out.println("Nama Member: " + this.getNamaMember());
    System.out.println("Nama Game: " + this.getNamaGame());
    System.out.println("Lama Sewa: " + this.getLamaSewa());
    System.out.println("Harga: " + this.getHarga());
    System.out.println("Total Harga: " + this.hitungHarga());
  }
}
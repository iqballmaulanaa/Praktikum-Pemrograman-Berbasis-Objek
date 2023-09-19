/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
class Pelanggan08 {
    private String nama;
    private Mobil08 mobil;
    private Sopir08 sopir;
    private int hari;

    public Pelanggan08() {
        // Constructor default
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil08 getMobil() {
        return mobil;
    }

    public void setMobil(Mobil08 mobil) {
        this.mobil = mobil;
    }

    public Sopir08 getSopir() {
        return sopir;
    }

    public void setSopir(Sopir08 sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir08(hari);
    }
}
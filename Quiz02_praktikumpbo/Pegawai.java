/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2Semester3;

/**
 *
 * @author Iqbal Maulana
 */

public class Pegawai {
    private String noIndukPegawai;
    private String nama;
    public int gaji;

    public void setNoIndukPegawai(String noIndukPegawai) {
        this.noIndukPegawai = noIndukPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoIndukPegawai() {
        return noIndukPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void tampilDataPokokPegawai() {
        System.out.println("No Induk : " + noIndukPegawai);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok : " + gaji);
    }
}

//Iqbal Maulana 2231750015
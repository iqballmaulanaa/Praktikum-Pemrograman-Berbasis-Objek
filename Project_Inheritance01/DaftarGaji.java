/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int maxPegawai) {
        listPegawai = new Pegawai[maxPegawai];
        count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        } else {
            System.out.println("Daftar pegawai penuh");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            System.out.println("Nama Pegawai: " + listPegawai[i].getNama());
            System.out.println("Gaji Pegawai: " + listPegawai[i].getGaji());
            System.out.println("==================================");
        }
    }
}

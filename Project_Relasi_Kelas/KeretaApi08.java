/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
class KeretaApi08 {
    private String nama;
    private String kelas;
    private Pegawai08 masinis;
    private Pegawai08 asisten;

    public KeretaApi08(String nama, String kelas, Pegawai08 masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi08(String nama, String kelas, Pegawai08 masinis, Pegawai08 asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai08 getMasinis() {
        return masinis;
    }

    public void setMasinis(Pegawai08 masinis) {
        this.masinis = masinis;
    }

    public Pegawai08 getAsisten() {
        return asisten;
    }

    public void setAsisten(Pegawai08 asisten) {
        this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis:\n" + this.masinis.info() + "\n";
        if (this.asisten != null) {
            info += "Asisten:\n" + this.asisten.info() + "\n";
        }
        return info;
    }
}
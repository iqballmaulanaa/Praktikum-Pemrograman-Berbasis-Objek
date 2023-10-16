/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5); 
        Pegawai pegawai1 = new Pegawai("P001", "Iqbal Maulana", "Jl. ABC");
        Dosen dosen1 = new Dosen("D001", "Prof. Smith", "Jl. XYZ");
        dosen1.setSKS(8);

        daftar.addPegawai(pegawai1);
        daftar.addPegawai(dosen1);

        daftar.printSemuaGaji();
    }
}

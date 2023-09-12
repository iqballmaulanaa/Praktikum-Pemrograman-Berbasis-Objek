/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KoperasiGetterSetter08;

/**
 *
 * @author USER
 */
public class KoperasiDemo08 {
    public static void main(String[] args) {
        Anggota08 anggota1 = new Anggota08("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.pinjam (5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan ());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        manusia1.bernafas();
        manusia1.makan();

        manusia2.bernafas();
        manusia2.makan();

        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        dosen.lembur();
        mahasiswa.tidur();
    }
}

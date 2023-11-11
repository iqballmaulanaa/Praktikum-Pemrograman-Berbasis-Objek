/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Gorilla extends Binatang implements Karnivora, Herbivora {
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.print("Daging + Tumbuhan");
    }

    public void displayData() {
    System.out.println("Jenis: Karnivora + Herbivora");
    System.out.print("Makanan: ");
    displayMakan();
    System.out.println();
    System.out.println("Nama: " + nama);
    System.out.println("Jumlah Kaki: " + jmlKaki);
    System.out.println("Suara: " + suara);
    System.out.println("Warna Bulu: " + warnaBulu);
    }
}

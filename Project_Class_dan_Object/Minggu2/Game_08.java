/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2;

/**
 *
 * @author USER
 */
public class Game_08 {
    private int idGame08;
    private String namaGame08;
    private double hargaSewa08;

    public Game_08(int idGame08, String namaGame08, double hargaSewa08) {
        this.idGame08 = idGame08;
        this.namaGame08 = namaGame08;
        this.hargaSewa08 = hargaSewa08;
    }

    public void tampilDataGame08() {
        System.out.println("ID Game: " + idGame08);
        System.out.println("Nama Game: " + namaGame08);
        System.out.println("Harga Sewa: " + hargaSewa08);
    }
}
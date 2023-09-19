/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
class Penyewa {
    private String idPenyewa;
    private String nama;

    public Penyewa(String idPenyewa, String nama) {
        this.idPenyewa = idPenyewa;
        this.nama = nama;
    }

    // Getter dan setter

    public String info() {
        String info = "";
        info += "ID Penyewa: " + idPenyewa + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
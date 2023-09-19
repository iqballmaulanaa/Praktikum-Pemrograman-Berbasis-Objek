/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai08 masinis = new Pegawai08("1234", "Spongebob Squarepants");
        Pegawai08 asisten = new Pegawai08("4567", "Patrick Star");
        KeretaApi08 keretaApi = new KeretaApi08("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OVERLOADING_DAN_OVERRIDING;

/**
 *
 * @author USER
 */
public class Perkalianku {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(int a, int b, int c){ 
        System.out.println(a * b * c);
    }
    public static void main(String args[]){ 
        Perkalianku objek = new Perkalianku();
        objek.perkalian(25, 43); 
        objek.perkalian(34, 23, 56); 
    }
}
//1. Dari source coding diatas terletak dimanakah overloading?
//Dalam kasus ini, memiliki dua versi metode perkalian dalam kelas Perkalianku. 
//Yang pertama menerima dua parameter int a dan int b, sementara yang kedua menerima tiga parameter int a, int b, dan int c. 
//Karena keduanya memiliki nama metode yang sama tetapi jumlah parameter yang berbeda, ini adalah contoh yang baik dari overloading.

//2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda?
//Terdapat dua metode overloading dari metode perkalian. Metode pertama menerima dua parameter, dan metode kedua menerima tiga parameter. 
//Oleh karena itu, ada dua jumlah parameter yang berbeda dalam kasus ini: dua parameter dan tiga parameter.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OVERLOADING_DAN_OVERRIDING;

/**
 *
 * @author USER
 */
public class Perkalianku2 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(double a, double b){ 
        System.out.println(a * b);
    }
    public static void main(String args[]){ 
        Perkalianku2 objek = new Perkalianku2();
        objek.perkalian(25, 43); 
        objek.perkalian(34.56, 23.7); 
    }
}

//1. Dari source coding diatas terletak dimanakah overloading?
//Overloading terjadi pada metode perkalian. pada kode diatas memiliki dua versi metode perkalian yang memiliki nama yang sama tetapi tipe parameter yang berbeda. 
//Yang pertama menerima dua parameter int (a dan b), sedangkan yang kedua menerima dua parameter double (a dan b). 
//Ini adalah contoh yang baik dari overloading.

//2. Jika terdapat overloading ada berapa tipe parameter yang berbeda?
//Terdapat dua tipe parameter yang berbeda dalam overloading ini: int dan double. Jadi, ada dua tipe parameter yang berbeda dalam kasus ini.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OVERLOADING_DAN_OVERRIDING;

/**
 *
 * @author USER
 */
class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}

//1. Dari source coding diatas terletak dimanakah overriding? 
//Overriding terjadi dalam kelas Piranha pada metode swim.

//2. Jabarkanlah apabila sourcoding diatas jika terdapat overriding?
//Penjelasan jika terdapat overriding:
//Kelas Fish memiliki metode swim.
//Kelas Piranha, yang merupakan turunan dari Fish, menyediakan implementasi ulang untuk metode swim. 
//Metode swim dalam Piranha menggantikan (override) metode swim dalam kelas Fish.
//Ketika Anda membuat objek Piranha dan memanggil metode swim pada objek tersebut, implementasi metode swim dalam Piranha yang akan dieksekusi. 
//Ini adalah contoh overriding, di mana perilaku metode swim diubah oleh kelas Piranha tanpa mengubah nama atau tanda tangan metode tersebut.
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class SepedaDemo
{
    public static void main(String[] args)
    {
// Buat dua buah objek sepeda 
        Sepeda spd1 = new Sepeda ();
        Sepeda spd2 = new Sepeda ();
        SepedaGunung spd3 = new SepedaGunung();

// Panggil method didalam objek sepeda
spd1.setMerek ("Polygone");
spd1.tambahKecepatan (10);
spd1.gantiGear (2); 
spd1.cetakStatus();

spd2.setMerek("Wilm Cycle");
spd2.tambahKecepatan (10);
spd2.gantiGear (2);
spd2.tambahKecepatan (10);
spd2.gantiGear (3);
spd2.cetakStatus();

spd3.setMerek("Klinee");
spd3.tambahKecepatan(5);
spd3.gantiGear(7);
spd3.setTipeSuspensi("Gas suspension");
spd3.cetakStatus();
    }
}

//1. Jelaskan perbedaan antara objek dengan class!
//Perbedaan antara Objek dan Class:
//Class: Merupakan sebuah blueprint atau cetak biru yang mendefinisikan struktur, perilaku, dan atribut yang akan dimiliki oleh objek. Ini adalah entitas yang digunakan untuk menciptakan objek. Class mendefinisikan atribut (variabel) dan metode (fungsi) yang akan dimiliki oleh objek-objek yang dibuat dari class tersebut.
//Objek: Merupakan instance konkret yang diciptakan dari class. Objek memiliki nilai nyata untuk setiap atribut yang didefinisikan dalam class. Dalam konteks program di atas, "Sepeda" adalah class yang mendefinisikan struktur dan metode, sementara "spd1", "spd2", dan "spd3" adalah objek-objek yang diciptakan dari class "Sepeda".

//2. Jelaskan alasan warna dan tipe mesin dapat menjadi atribut dari objek mobil!
//Warna dan Tipe Mesin sebagai Atribut Objek Mobil:
//Atribut seperti warna dan tipe mesin menjadi atribut dari objek mobil karena mereka adalah karakteristik khusus yang membedakan satu mobil dari yang lain. Dalam paradigma berorientasi objek, objek didesain untuk merepresentasikan entitas dunia nyata dengan semua detail dan karakteristiknya. Warna dan tipe mesin adalah bagian integral dari identitas sebuah mobil, dan karena itu, mereka dapat diwakili sebagai atribut dari objek mobil.

//3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural!
//Kelebihan Utama Pemrograman Berorientasi Objek (OOP):
//Salah satu kelebihan utama pemrograman berorientasi objek adalah penciptaan abstraksi yang lebih baik. Ini berarti kita dapat mengelompokkan data dan fungsi yang berkaitan dalam satu entitas (class), yang memungkinkan pemahaman dan pemeliharaan yang lebih baik. Beberapa kelebihan lain dari OOP meliputi modularitas, enkapsulasi, pewarisan, dan polimorfisme, yang semuanya membantu dalam pembuatan dan pemeliharaan kode yang lebih terstruktur, mudah dimengerti, dan mudah diperluas.

//4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti “public String nama,alamat;”?
//Pendefinisian Atribut dalam Satu Baris Kode:
//Ya, diperbolehkan untuk mendefinisikan beberapa atribut dalam satu baris kode seperti "public String nama, alamat;". Ini adalah cara yang sah untuk mendeklarasikan beberapa atribut dengan tipe data yang sama dalam satu baris. Namun, lebih disarankan untuk menjaga kode tetap mudah dibaca dengan memberikan setiap atribut barisnya sendiri, terutama jika ada banyak atribut atau jika atribut memiliki tipe data yang berbeda.

//5. Pada class SepedaGunung, jelaskan alasan atribut merk, kecepatan, dan gear tidak lagi ditulis di dalam class tersebut!
//Atribut pada Class SepedaGunung:
//Atribut "merek", "kecepatan", dan "gear" tidak perlu ditulis lagi di dalam class "SepedaGunung" karena class "SepedaGunung" adalah subclass dari class "Sepeda". Subclass mewarisi semua atribut dan metode dari superclassnya. Oleh karena itu, atribut-atribut tersebut sudah ada di dalam subclass "SepedaGunung" karena mereka didefinisikan di class "Sepeda". Dalam class "SepedaGunung", kita hanya menambahkan atribut "tipeSuspensi" yang spesifik untuk sepeda gunung dan meng-override metode "cetakStatus" untuk mencetak tipe suspensi juga.
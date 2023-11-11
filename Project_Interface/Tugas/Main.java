/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");

        keledai.displayData();
        System.out.println();
        gorilla.displayData();
        System.out.println();
        singa.displayData();
    }
}

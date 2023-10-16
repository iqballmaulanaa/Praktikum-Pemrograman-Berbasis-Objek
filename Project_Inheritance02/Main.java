/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Mac macbook = new Mac("Apple", 2, 16, "Intel Core i7", "Lithium Polymer", "Face ID");
        Windows laptop = new Windows("Dell", 2, 8, "Intel Core i5", "Li-Ion", "Touchscreen");

        Pc desktop = new Pc("HP", 3, 32, "AMD Ryzen 7", 27);

        System.out.println("Data Macbook:");
        macbook.tampilMac();

        System.out.println("\nData Laptop Windows:");
        laptop.tampilWindows();

        System.out.println("\nData Desktop PC:");
        desktop.tampilPc();
    }
}

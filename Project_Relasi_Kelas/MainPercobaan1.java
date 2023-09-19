/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor08 p = new Processor08("Intel i5", 3);

        Laptop08 L = new Laptop08("Thinkpad", p);
        L.info08();

        Processor08 p1 = new Processor08();
        p1.setMerk08("Intel i5");
        p1.setCache08(4);
        Laptop08 L1 = new Laptop08();
        L1.setMerk08("Thinkpad");
        L1.setProc08(p1);
        L1.info08();
    }
}
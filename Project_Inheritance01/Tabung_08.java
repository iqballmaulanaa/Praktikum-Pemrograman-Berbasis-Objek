/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Tabung_08 extends Bangun_08 {
    protected int t;

    public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        double volume = super.phi * super.r * super.r * this.t;
        System.out.println("Volume Tabung adalah: " + volume);
    }

    public void voume() {
        volume(); // Memanggil metode volume() untuk menghitung volume
    }
}
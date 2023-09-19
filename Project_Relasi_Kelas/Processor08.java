/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
public class Processor08 {
    private String merk08;
    private double cache08;

    public Processor08() {
        // Constructor default
    }

    public Processor08(String merk08, double cache08) {
        this.merk08 = merk08;
        this.cache08 = cache08;
    }

    public String getMerk08() {
        return merk08;
    }

    public void setMerk08(String merk08) {
        this.merk08 = merk08;
    }

    public double getCache08() {
        return cache08;
    }

    public void setCache08(double cache08) {
        this.cache08 = cache08;
    }

    public void info08() {
        System.out.printf("Merk Processor = %s\n", merk08);
        System.out.printf("Cache Memory = %.2f\n", cache08);
    }
}
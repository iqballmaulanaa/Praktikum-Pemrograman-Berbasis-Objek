/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author USER
 */
public class Laptop08 {
    private String merk08;
    private Processor08 proc08;

    public Laptop08() {
        // Constructor default
    }

    public Laptop08(String merk08, Processor08 processor08) {
        this.merk08 = merk08;
        this.proc08 = processor08;
    }

    public String getMerk08() {
        return merk08;
    }

    public void setMerk08(String merk08) {
        this.merk08 = merk08;
    }

    public Processor08 getProc08() {
        return proc08;
    }

    public void setProc08(Processor08 processor08) {
        this.proc08 = processor08;
    }

    public void info08() {
        System.out.println("Merk Laptop = " + merk08);
        proc08.info08();
    }
}
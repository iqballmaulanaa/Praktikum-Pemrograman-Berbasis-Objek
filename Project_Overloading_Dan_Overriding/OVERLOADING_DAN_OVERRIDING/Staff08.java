/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OVERLOADING_DAN_OVERRIDING;

/**
 *
 * @author USER
 */
public class Staff08 extends Karyawan08 {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGaji() {
        return super.getGaji() + (lembur * gajiLembur);
    }

    public void lihatInfo() {
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.println("Jml Lembur: " + this.getLembur());
        System.out.printf("Gaji Lembur: %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji: %.0f\n", this.getGaji());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class StaffTetap08 extends Staff08 {
    public String golongan;
    public int asuransi;
    
    public StaffTetap08(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) { 
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap() {
        System.out.println("====================Data Staff Tetap====================");
        super.tampilDataStaff();
        System.out.println("Golongan = " + golongan);
        System.out.println("Jumlah Asuransi = " + asuransi);
        System.out.println("Gaji Bersih = " + (gaji + lembur - potongan - asuransi));
    }
}
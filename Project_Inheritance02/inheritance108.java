/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class inheritance108 {
    public static void main(String[] args) {
        StaffTetap08 ST = new StaffTetap08("Budi", "Malang", "Lakilaki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilStaffTetap();
        
        StaffHarian08 SH = new StaffHarian08("Indah", "Malang", "Lakilaki", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian(); // Anda lupa memanggil metode tampilStaffHarian
    }
}
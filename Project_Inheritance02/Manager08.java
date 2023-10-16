/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Manager08 extends Karyawan08 {
    public int tunjangan;
    
    public Manager08(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan =" +tunjangan);
        System.out.println("Total Gaji =" +(super.gaji+tunjangan));
    }
}
 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOMinggu10.abstractclass;

/**
 *
 * @author USER
 */
public class Orang {
    private String nama;
    private Hewan08 hewanPeliharaan;
    
    public Orang(String nama)
    {
        this.nama= nama;
    }
    
    public void peliharaHewan(Hewan08 hewanPeliharaan)
    {
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan()
    {
        System.out.println("Namaku" + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("----------------------------------------------");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu1;

/**
 *
 * @author USER
 */
public class SepedaGunung extends Sepeda
{
    private String tipeSuspensi;
    
    public void setTipeSuspensi (String newValue)
    {
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus ()
    {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
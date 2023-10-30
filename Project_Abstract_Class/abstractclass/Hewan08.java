/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOMinggu10.abstractclass;

/**
 *
 * @author USER
 */
public abstract class Hewan08 {
    private int umur;
    
    protected Hewan08()
    {
        this.umur=0;
    }
    
    public void bertambahUmur()
    {
        this.umur +=1;
    }
    
    public abstract void bergerak();
}

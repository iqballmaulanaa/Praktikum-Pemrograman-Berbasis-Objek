/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorEncapsulation08;

/**
 *
 * @author USER
 */
public class Motor08 {
    private int kecepatan08 = 0; 
    private boolean kontakOn08 = false; 
    
    public void nyalakanMesin08(){
        kontakOn08 = true;
    }
    
    public void matikanMesin08(){
        kontakOn08 = false;
        kecepatan08 = 0;
    }
    
    public void tambahKecepatan08(){
        if (kontakOn08 == true){
            kecepatan08 += 5;
        } 
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatan08(){
        if (kontakOn08 == true){ 
            kecepatan08 -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus08(){ 
        if (kontakOn08 == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan08 + "\n");
    }
}
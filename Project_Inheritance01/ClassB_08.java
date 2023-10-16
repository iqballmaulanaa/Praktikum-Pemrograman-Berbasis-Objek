/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class ClassB_08 {
    public int z;
    public int x;
    public int y;
    
    public void getNilaiZ(){
        System.out.println("nilai z:"+ z);
    }
    public void getJumlah(){
        System.out.println("jumlah:"+ (x+y+z));
    }

    public void getNilai() {
        System.out.println("nilai x:"+ x);
        System.out.println("nilai y:"+ y);
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setZ(int z){
        this.z = z;
    }
}

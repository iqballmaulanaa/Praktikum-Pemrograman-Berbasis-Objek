/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MotorEncapsulation08;

/**
 *
 * @author USER
 */
public class MotorDemo08 {
    public static void main(String[] args) { 
        Motor08 motor = new Motor08();
        motor.printStatus08(); 
        motor.tambahKecepatan08();
        
        motor.nyalakanMesin08(); 
        motor.printStatus08();
        
        motor.tambahKecepatan08(); 
        motor.printStatus08();
        
        motor.tambahKecepatan08(); 
        motor.printStatus08();
        
        motor.tambahKecepatan08(); 
        motor.printStatus08();
        
        motor.matikanMesin08(); 
        motor.printStatus08();
    }
}
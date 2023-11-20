/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author USER
 */
public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1"); 
        ow.pay(eBill);//pay for electricity bill 
        System.out.println("--------------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500); 
        ow.pay(pEmp); //pay for permanent employee
        System.out.println("--------------------------------------");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);//show.permanent employee into 
        System.out.println("--------------------------------------");
        ow.showMyEmployee(iEmp); //ternship employee into
    }
}

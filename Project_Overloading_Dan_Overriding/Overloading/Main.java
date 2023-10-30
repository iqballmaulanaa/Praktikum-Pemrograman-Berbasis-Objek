/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int sudutA = 60;
        int sudutB = 30;
        int sisiA = 3;
        int sisiB = 4;
        int sisiC = 5;

        int totalSudut1 = segitiga.totalSudut(sudutA);
        int totalSudut2 = segitiga.totalSudut(sudutA, sudutB);
        int keliling1 = segitiga.keliling(sisiA, sisiB, sisiC);
        double keliling2 = segitiga.keliling(sisiA, sisiB);

        System.out.println("Total Sudut 1: " + totalSudut1);
        System.out.println("Total Sudut 2: " + totalSudut2);
        System.out.println("Keliling 1: " + keliling1);
        System.out.println("Keliling 2: " + keliling2);
    }
}

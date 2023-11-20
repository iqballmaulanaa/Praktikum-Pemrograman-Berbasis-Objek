/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2Semester3;

/**
 *
 * @author Iqbal Maulana
 */
public class Programmer extends Pegawai {
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void tampilDataProgrammer() {
        tampilDataPokokPegawai();
        System.out.println("Bonus : " + bonus);
        int totalGaji = gaji + bonus;
        System.out.println("Total Gaji : " + totalGaji);
    }
}

//Iqbal Maulana 2231750015
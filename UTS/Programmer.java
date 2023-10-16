/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

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
        tampilPokokDataPegawai();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Gaji: " + (gaji + bonus));
    }
}


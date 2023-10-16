/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Iqbal Maulana
 */
public class PemegangSaham extends Manajer {
    private int deviden;
    private int jumSaham;

    public void setDeviden(int deviden) {
        this.deviden = deviden;
    }

    public void setJumSaham(int jumSaham) {
        this.jumSaham = jumSaham;
    }

    public void tampilDataPemegangSaham() {
        tampilDataManajer();
        System.out.println("Deviden: " + deviden);
        System.out.println("Jum Saham: " + jumSaham);
        System.out.println("Total Gaji: " + (gaji + tunjanganJabatan + deviden));
    }
}


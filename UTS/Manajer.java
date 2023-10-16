/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Iqbal Maulana
 */
public class Manajer extends Pegawai {
    protected int tunjanganJabatan; 

    public void setTunjanganJabatan(int tunjangan) {
        this.tunjanganJabatan = tunjangan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void tampilDataManajer() {
        tampilPokokDataPegawai();
        System.out.println("Tunjangan Jabatan: " + tunjanganJabatan);
        System.out.println("Total Gaji: " + (gaji + tunjanganJabatan));
    }
}

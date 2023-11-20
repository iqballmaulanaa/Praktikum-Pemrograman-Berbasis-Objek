/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2Semester3;

/**
 *
 * @author Iqbal Maulana
 */
public class Manajer extends Pegawai {
    private int tunjanganJabatan;

    public void setTunjanganJabatan(int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void tampilDataManajer() {
        tampilDataPokokPegawai();
        System.out.println("Tunjangan Jabatan Manager : " + tunjanganJabatan);
        int totalGaji = gaji + tunjanganJabatan;
        System.out.println("Total Gaji : " + totalGaji);
    }
}

//Iqbal Maulana 2231750015
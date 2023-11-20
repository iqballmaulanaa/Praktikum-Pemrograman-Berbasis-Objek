/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuis2Semester3;

/**
 *
 * @author Iqbal Maulana
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan posisi pekerjaan (Pegawai, Programmer, Manajer): ");
        String posisi = scanner.nextLine();

        if (posisi.equalsIgnoreCase("Pegawai")) {
            Pegawai pegawai = new Pegawai();
            pegawai.setNoIndukPegawai("001");
            pegawai.setNama("Budi");
            pegawai.gaji = (int) (10000000 * 0.5); // 50% dari Manajer
            pegawai.tampilDataPokokPegawai();
        } else if (posisi.equalsIgnoreCase("Programmer")) {
            Programmer programmer = new Programmer();
            programmer.setNoIndukPegawai("001");
            programmer.setNama("Budi");
            programmer.gaji = (int) (10000000 * 0.7); // 70% dari Manajer
            programmer.setBonus((int) (programmer.gaji * 0.5)); // 50% dari Manajer
            programmer.tampilDataProgrammer();
        } else if (posisi.equalsIgnoreCase("Manajer")) {
            Manajer manajer = new Manajer();
            manajer.setNoIndukPegawai("001");
            manajer.setNama("Budi");
            manajer.gaji = 10000000;
            manajer.setTunjanganJabatan((int) (10000000 * 0.5)); // 50% dari Manajer
            manajer.tampilDataManajer();
        } else {
            System.out.println("Posisi pekerjaan tidak valid");
        }
    }
}

//Iqbal Maulana 2231750015
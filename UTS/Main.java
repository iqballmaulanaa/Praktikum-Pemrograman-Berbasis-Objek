/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Iqbal Maulana
 */
public class Main {
    public static void main(String[] args) {
        PemegangSaham pemegangSaham = new PemegangSaham();
        pemegangSaham.setNoIndukPegawai("001");
        pemegangSaham.setNama("Drogba");
        pemegangSaham.gaji = 100000;
        pemegangSaham.setTunjanganJabatan(50000);
        pemegangSaham.setDeviden(1000);
        pemegangSaham.setJumSaham(10);

        pemegangSaham.tampilDataPemegangSaham();
    }
}

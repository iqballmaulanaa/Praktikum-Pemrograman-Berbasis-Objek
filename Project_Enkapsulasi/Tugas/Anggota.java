/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Anggota
{
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman)
    {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama()
    {
        return nama;
    }

    public double getLimitPinjaman()
    {
        return limitPinjaman;
    }

    public double getJumlahPinjaman()
    {
        return jumlahPinjaman;
    }

    public boolean pinjam(double jumlah)
    {
        if (jumlahPinjaman + jumlah <= limitPinjaman) {
            jumlahPinjaman += jumlah;
            return true;
        } else {
            return false;
        }
    }

    public void angsur(double jumlah)
    {
        jumlahPinjaman -= jumlah;
    }
}
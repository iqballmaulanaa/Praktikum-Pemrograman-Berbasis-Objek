/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Pc extends Komputer {
    int ukuranMonitor;

    Pc() {
    }

    Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    void tampilPc() {
        tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;

/**
 *
 * @author USER
 */
public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatCumlaude(sarjanaCum);
        pakRektor.beriSertifikatCumlaude(masterCum);

        pakRektor.beriSertifikatMawapres(masterCum); // Anda bisa memberikan sertifikat MAWAPRES kepada PascaSarjana.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan61.bangunruang;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini berisi tentang Bangun Ruang
 */
public class IF110119004Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang bola = new Bola(7);
        bola.tampilVolume();
        
        BangunRuang tabung = new Tabung(10, 21);
        tabung.tampilVolume();
        
        BangunRuang kerucut = new Kerucut(14, 9);
        kerucut.tampilVolume();
    }
    
}

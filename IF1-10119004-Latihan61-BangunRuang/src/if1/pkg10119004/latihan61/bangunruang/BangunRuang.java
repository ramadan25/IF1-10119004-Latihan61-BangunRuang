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
public abstract class BangunRuang {
    protected double r;

    public BangunRuang(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    
    public abstract double hitungVolume();
    
    public void tampilVolume() {
        System.out.printf("Hasil : V = %.1f %n%n", hitungVolume());
    }
    
}

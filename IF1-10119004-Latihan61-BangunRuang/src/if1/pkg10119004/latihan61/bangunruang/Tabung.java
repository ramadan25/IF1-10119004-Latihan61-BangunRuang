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
public class Tabung extends BangunRuang {
    private double h; // ketinggian
    public Tabung(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(super.getR(), 2) * h;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Tabung");
        super.tampilVolume();
    }
    
}

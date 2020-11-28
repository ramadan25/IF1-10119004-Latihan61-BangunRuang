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
public class Kerucut extends BangunRuang {
    private double t;

    public Kerucut(double r, double t){
        super(r);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * Math.pow(super.getR(), 2) * t) / 3;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Kerucut");
        super.tampilVolume();
    }
    
}

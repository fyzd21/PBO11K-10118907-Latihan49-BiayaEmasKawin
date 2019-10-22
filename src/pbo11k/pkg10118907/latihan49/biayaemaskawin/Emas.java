/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan49.biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan harga emas menggunakan konsep OOP
 * 
 */
public class Emas {
    private double hargapergram, berat;

    public double getHargapergram() {
        return hargapergram;
    }

    public void setHargapergram(double hargapergram) {
        this.hargapergram = hargapergram;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    
    public double hitungTotal(double berat, double hargapergram) {
        return berat * hargapergram;
    }
    
}

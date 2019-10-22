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
public class PBO11K10118907Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program penghitung harga emas");
        Emas e = new Emas();
        e.setBerat(15.7);
        e.setHargapergram(570000);
        
        System.out.println("Total berat emas : "+e.getBerat()+" gram");
        System.out.println("Harga emas per gram : Rp"+e.getHargapergram());
        System.out.println("\nTotal harga emas : Rp"+e.hitungTotal(e.getBerat(), e.getHargapergram()));
    }
    
}

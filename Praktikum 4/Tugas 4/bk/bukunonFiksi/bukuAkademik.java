/*
 * File : bukuAkademik.java 03/21/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : representasi dasar dari objek buku Akademik, turunan kelas bukuNonFiksi 
 */
package bk.bukunonFiksi;


public class bukuAkademik extends bukuNonFiksi{
    public bukuAkademik(String judul,String penulis,String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, subjek, jumlahHalaman, harga);
    }
    // public void view() {
    //     super.view(); // Call the view method of the superclass to print common information
    //     System.out.println("Subjek: " + this.subjek);
    //     System.out.println("Jumlah Halaman: " + this.jumlahHalaman);
    //     System.out.println("Harga: " + this.harga);
    // }
    
    
}


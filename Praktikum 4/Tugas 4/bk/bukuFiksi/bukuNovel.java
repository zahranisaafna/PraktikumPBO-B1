/*
 * File : bukuNovel.java 03/21/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : representasi dasar dari objek buku Novel, turunan kelas bukuFiksi 
 */
package bk.bukuFiksi;


public class bukuNovel extends bukuFiksi {
    public  bukuNovel(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit, genre, jumlahHalaman, harga);
    }
    // public void view() {
    //     super.view(); // Call the view method of the superclass to print common information
    //     System.out.println("Genre: " + this.genre);
    //     System.out.println("Jumlah Halaman: " + this.jumlahHalaman);
    //     System.out.println("Harga: " + this.harga);
    // }
}

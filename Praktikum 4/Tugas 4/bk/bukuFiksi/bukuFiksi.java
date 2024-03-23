/*
 * File : bukuFiksi.java 03/21/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : representasi dasar dari objek buku Fiksi, turunan kelas Buku 
 */

package bk.bukuFiksi;
import bk.buku.Buku;

public class bukuFiksi  extends Buku{
    //Atribut
    private String genre;
    private int jumlahHalaman; 
    private double harga;
    

    public bukuFiksi(String judul,String penulis,String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this. genre = genre;
        this. jumlahHalaman = jumlahHalaman;
        this. harga = harga;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    public double getHarga(){
        return this.harga;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void view(){
        System.out.println("Judul Buku : "+ getJudul());
        System.out.println("Penulis Buku : "+ getPenulis());
        System.out.println("Tahun Terbit Buku : "+ getTahunTerbit());
        System.out.println("Genre Buku : "+ getGenre());
        System.out.println("Jumlah Halaman Buku : "+ getJumlahHalaman());
        System.out.println("Harga Buku : "+ getHarga());

    }   
}

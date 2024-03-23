/*
 * File : bukuNonFiksi.java 03/21/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : representasi dasar dari objek buku NonFiksi, turunan kelas Buku 
 */

package bk.bukunonFiksi;
import bk.buku.Buku;

public class bukuNonFiksi extends Buku{
    //Atribut
    private String subjek;
    private int jumlahHalaman;
    private double harga;
    // protected String subjek;
    // protected int jumlahHalaman;
    // protected double harga;

    public bukuNonFiksi(String judul,String penulis,String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman=jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return this.subjek;
    }
    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    public double getHarga(){
        return this.harga;
    }
    public void setSubjek(String subjek){
        this.subjek = subjek;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void view(){
        System.out.println("Judul Buku : "+ getJudul());
        System.out.println("Penulis Buku : "+ getPenulis());
        System.out.println("Tahun Terbit Buku : "+ getTahunTerbit());
        System.out.println("Subjek Buku : "+ getSubjek());
        System.out.println("Jumlah Halaman Buku : "+ getJumlahHalaman());
        System.out.println("Harga Buku : "+ getHarga());
    }
}



        
        
   
   




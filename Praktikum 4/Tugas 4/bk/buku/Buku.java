/*
 * File : Buku.java 03/21/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : representasi dasar dari objek buku 
 */
package bk.buku;

public class Buku {

    //Atribur
    private String judul;
    private String penulis;
    private String tahunTerbit;

    //construktor
    public Buku(String judul, String penulis, String tahunTerbit ){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit =  tahunTerbit;
    }

    //method
    public String getJudul(){
        return this.judul;
    }
    public String getPenulis(){
        return this.penulis;
    }
    public String getTahunTerbit(){
        return this.tahunTerbit;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;

    }
    public void view(){
        System.out.println("Judul Buku : "+ getJudul());
        System.out.println("Penulis Buku : "+ getPenulis());
        System.out.println("Tahun Terbit Buku : "+ getTahunTerbit());
    }
}
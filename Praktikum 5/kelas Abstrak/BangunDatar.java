/*
 * File : BangunDatar.java 03/19/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : kelas abstrak, berisi abstraksi bangun datar
 */

 public abstract class BangunDatar {
 
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l){
        luas = l;

    }
    public double getLuas(){
        return luas;
    }
 }
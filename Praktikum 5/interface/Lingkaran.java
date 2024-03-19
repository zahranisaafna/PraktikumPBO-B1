/*
 * File : Lingkaran.java 03/19/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 */
//mengambil konstanta yang ada di kelas java.lang.math

import static java.lang.Math.PI;
class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}

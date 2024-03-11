/*Nama : Zahra Nisaa' Fitria Nur'Afifah
 *NIM : 24060122140162
 *Tanggal : 9 Maret 2024
 * File : Segitiga.java
 */
public class Segitiga{
    //deklarasi atribut
    private double alas;
    private double tinggi;


    //deklarasi konstruktor
    public Segitiga(){
        alas = 0;
        tinggi = 0;
    }

    //deklarasi overloading konstruktor
    public Segitiga(double a, double t){
        alas = a;
        tinggi = t;
    }

    //deklarasi metode
  
    public double getAlas(){
        return  alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        double luas = (alas*tinggi)/2;
        return luas ;
    }
}
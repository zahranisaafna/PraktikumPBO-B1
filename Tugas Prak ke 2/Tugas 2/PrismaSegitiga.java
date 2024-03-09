/*Nama : Zahra Nisaa' Fitria Nur'Afifah
 *NIM : 24060122140162
 *Tanggal : 9 Maret 2024
 * File : PrismaSegitiga.java
 */
public class PrismaSegitiga{
    //deklarasi atribut
    private Segitiga alas;
    private double tinggiPrisma;

    //deklarasi konstruktor
    public  PrismaSegitiga(){
        alas = new Segitiga();
        tinggiPrisma = 0;   
    }

    //deklarasi overloading konstruktor
    public  PrismaSegitiga(Segitiga alasSegitiga, double tp){
        alas = alasSegitiga;
        tinggiPrisma = tp;
    }

    //deklarasi metode
    public double hitungVolume(){
        double Volume = alas.hitungLuas()*tinggiPrisma;
        return Volume;
    }

    public double hitungLuasPermukaan(){
        double LuasPermukaan = ((2*alas.hitungLuas())+(3*alas.getAlas()*tinggiPrisma));
        return LuasPermukaan;
    }

}
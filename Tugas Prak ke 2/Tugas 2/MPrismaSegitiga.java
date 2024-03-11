/*Nama : Zahra Nisaa' Fitria Nur'Afifah
 *NIM : 24060122140162
 *Tanggal : 9 Maret 2024
 * File : MPrismaSegitiga.java
 */
public class MPrismaSegitiga {

    public static void main(String[] args) {
        Segitiga s = new Segitiga(3,4);
        PrismaSegitiga pS = new PrismaSegitiga(s,5);


        System.out.println("segitiga("+s.getAlas()+","+s.getTinggiSegitiga()+")");
        
       
        double Volume = pS.hitungVolume();
        System.out.println("hitungVolume: "+ Volume);

        double LuasPermukaan = pS.hitungLuasPermukaan();
        System.out.println("hitungLuasPermukaan: "+ LuasPermukaan);
    }
}
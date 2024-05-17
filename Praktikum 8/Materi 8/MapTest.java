/*
 * File : MapTest.java 14/07/2024
 * Deskripsi : contoh penggunaan kelas collection dengan elemen 
*              berupa pasangan kunci (K) dan nilai (V), java.util.Map<K,V>.
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        //menempatkan elemen kunci dan nilai
        map.put(1, "Satu");
        map.put(2, "Dua");
        
        //mengambil elemen pertama
        System.out.println(map.get(1));

        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

        

        //bagaimana iterasi untuk mengambil keseluruhan
        
        // iterasi untuk mengambil keseluruhan nilai dari kunci
        for(Integer k : key){
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        
        }
        //nilai dari kunci? tulis pada laporan anda!
        
        /**Pembahasan
         * Kunci: 1, Nilai: Satu
         * Kunci: 2, Nilai: Dua
         */
        
         //petunjuk: gunakan iterasi seperti program ArrayListTest
    }
}

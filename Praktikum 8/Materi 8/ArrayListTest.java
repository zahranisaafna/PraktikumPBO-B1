/*
 * File : ArrayListTest.java 14/07/2024
 * Deskripsi :  Sebuah model Array yang dapat menampung jumlah elemen objek
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
        //inisialisasi ArrayList yang hanya dapat
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterai pada keseluruhan ArrayList
        for(String s: strings){
            System.out.print(s+" ");
        }
    }
}
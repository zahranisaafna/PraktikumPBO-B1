/*
 * File : Main.java 03/21/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : driver class untuk buku, bukuFiksi, bukuNovel, bukuNonFiksi, bukuAkademik
 */

package bk.main;
import bk.buku.Buku;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;;

public class Main {
    public static void main(String[] args) {
        //Membuat objek
        Buku b1 = new Buku("A Midsummer's Equation", "Keigo Higashino", "2011");
        Buku b2 = new Buku("Death On The Nile", "Agatha Christie", "1937");

        //Membuat objek buku fiksi
        bukuNovel Novel = new bukuNovel("Harry Potter", "J.K. Rowling", "1997", "Fantasy", 388, 116000);
        bukuFiksi Komik = new bukuFiksi("Moriarty The Patriot", "Ryosuke Takeuchi", "2016", "Mistery", 208, 28000);
        
        //Membuat objek buku Non Fiksi
        bukuAkademik BA = new bukuAkademik("Database System Concepts", "Abraham Silberschatz", "2019", "Computer Science", 1376, 1881883);
        bukuNonFiksi BI = new bukuNonFiksi("Biologi Edisi 8, Jilid 1", "Neil A. Campbell", "2008", "Biology", 618, 640000);
        
        
        //Menampilkan informasi buku menggunakan method view()
        System.out.println("==================================\n Informasi Buku: \n==================================\n");
        System.out.println("\nBuku 1\n");
        b1.view();
        System.out.println("\nBuku 2\n");
        b2.view();
        System.out.println();

        System.out.println("==================================\n Informasi Buku Fiksi: \n==================================\n");
        System.out.println("\nNovel\n");
        Novel.view();
        System.out.println("\nKomik\n");
        Komik.view();
        System.out.println();

        System.out.println("==================================\n Informasi Buku Non Fiksi: \n==================================\n");
        System.out.println("\nAkademik\n");
        BA.view();
        System.out.println("\nIlmiah\n");
        BI.view();
        System.out.println();
    }
    
}

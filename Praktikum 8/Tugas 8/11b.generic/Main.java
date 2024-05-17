/*
 * File : Main.java 16/07/2024 
 * Deskripsi : main class untuk generic Kupu
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 */

/**
 * SOAL
 *         
* {Terjemahkan ke bahasa Java}
* class Kupu has 
*  procedure gerak()
* class Ulat inherits Kupu has 
*  procedure gerak() 
*    output "ulat merayap"
* class Kepompong inherits Kupu has 
*  procedure gerak() 
*    output "kepompong diam"
* class KupuDewasa inherits Kupu has 
*  procedure gerak() 
*    output "kupu terbang"
* class Data<T> has 
*  isi is T
*  function getIsi() -> T
*     -> this.isi 
*  procedure setIsi( input x : T )  
*     this.isi <- x
* class Main 
*  {kamus}
*  K : Ulat 
*  anu : Data<Kupu>
*  {algoritma}
*  K <- new Ulat
*  anu <- new Data<>()
*  anu.setIsi(K)
*  anu.getIsi().gerak()
*  anu.setIsi( new Kepompong )
*  anu.getIsi().gerak()
*  anu.setIsi( new KupuDewasa )
*  anu.getIsi().gerak()
*/

public class Main {
  public static void main(String[] args) {
      // Kamus
      Ulat K;                // Deklarasi objek K dari kelas Ulat
      Data<Kupu> anu;        // Deklarasi objek anu dari kelas Data dengan tipe generik Kupu

      // Algoritma
      K = new Ulat();        // Inisialisasi objek K dengan kelas Ulat
      anu = new Data<>();    // Inisialisasi objek anu dengan kelas Data

      // Mengatur isi anu dengan objek Ulat dan memanggil metode gerak
      anu.setIsi(K);
      anu.getIsi().gerak();

      // Mengatur isi anu dengan objek Kepompong dan memanggil metode gerak
      Kepompong K2 = new Kepompong();
      Data<Kepompong> anu2 = new Data<>();
      anu2.setIsi(K2);
      anu2.getIsi().gerak();

      // Mengatur isi anu dengan objek KupuDewasa dan memanggil metode gerak
      KupuDewasa K3 = new KupuDewasa();
      Data<KupuDewasa> anu3 = new Data<>();
      anu3.setIsi(K3);
      anu3.getIsi().gerak();
  }
}

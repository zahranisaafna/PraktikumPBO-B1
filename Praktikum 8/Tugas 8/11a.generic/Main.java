/*
 * File : Main.java 16/07/2024 
 * Deskripsi : main class untuk generic Kupu
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 */

/*
 * SOAL
 * {Terjemahkan ke bahasa Java}
 * class Kupu has 
 *    procedure gerak()
 * class Ulat inherits Kupu has 
 *    procedure gerak() 
 *        output "ulat merayap"
 *  class Data<T> has 
 *    isi is T
 *    function getIsi() -> T
 *        -> this.isi 
 *    procedure setIsi( input x : T )  
 *        this.isi <- x
 * class Main 
 *  {kamus}
 *  K : Ulat 
 *  anu : Data<Kupu>
 *  {algoritma}
 *  K <- new Ulat
 *  anu <- new Data<>()
 *  anu.setIsi(K)
 *  anu.getIsi().gerak()


 */
public class Main {
  public static void main(String[] args) {
      Ulat K;           // Deklarasi objek K dari kelas Ulat
      Data<Kupu> anu;   // Deklarasi objek anu dari kelas Data dengan tipe generik Kupu

      K = new Ulat();       // Inisialisasi objek K
      anu = new Data<>();   // Inisialisasi objek anu
      anu.setIsi(K);        // Mengatur isi dari anu dengan objek K
      anu.getIsi().gerak(); // Memanggil metode gerak pada objek yang disimpan dalam anu
  }
}

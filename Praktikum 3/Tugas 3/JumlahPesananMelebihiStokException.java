/*
 * Nama : Zahra Nisaa' Fitria Nur'Afifah
 * NIM  : 24060122140162
 * Tanggal : 9 Maret 2024
 * File     : MenuTidakTersediaException.java
 * Deskripsi : Eksepsi buatan sendiri, ketika jumlah pesanan melebihi stok yang tersedia
 */
public class JumlahPesananMelebihiStokException extends Exception {
    // TO DO 2: Buat konstructor dengan parameter message dan panggil konstruktor parent dengan keyword super
     public JumlahPesananMelebihiStokException(String message) {
        super(message);
    }
}

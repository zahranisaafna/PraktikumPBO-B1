/*
 * File : Data.java 16/07/2024 
 * Deskripsi : kelas konstruksi generic untuk Kupu
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 */
public class Data <T extends Kupu>{
    private T isi;

    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}

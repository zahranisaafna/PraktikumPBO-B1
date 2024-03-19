/*
 * File : MBujurSangkar.java 03/19/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : kelas yang  mengimplementasikan cara menghitung luas bujur sangkar
 */
import java.util.Scanner;
class MBujurSangkar {
    public static void main(String[]args){
        Scanner scan =  new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi =  scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
    
}

/*
 * SOAL
 * apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi 
 * metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
 * maka kelas BujurSangkar tidak dapat diinstansiasi secara langsung karena tidak memenuhi persyaratan untuk menjadi kelas abstrak yang tidak lengkap.
 */
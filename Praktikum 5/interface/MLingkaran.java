/*
 * File : MLingkaran.java 03/19/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 * Deskrispsi : implementasi  cara menghitung luas lingkaran
 */



import java.util.Scanner;
public class MLingkaran{
	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Masukan jejari lingkaran 1: ");
		double jejari = scan1.nextDouble();

	
		Lingkaran luas = new Lingkaran(jejari);
		
		System.out.println("Luas lingkaran 1 adalah " +luas.hitungLuas());

		System.out.println("Masukan jejari lingkaran 2: ");
		double jejari2 = scan2.nextDouble();

		Lingkaran luas2 = new Lingkaran(jejari2);

		System.out.println("Luas lingkaran 2 adalah " +luas2.hitungLuas());
		scan1.close();
		scan2.close();
	}

}

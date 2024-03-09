/*
 * Nama : Zahra Nisaa' Fitria Nur'Afifah
 * NIM  : 24060122140162
 * Tanggal : 9 Maret 2024
 * File : Tiket.java
 * Deskripsi : Program untuk menunjukkan tiket
 */
public class Tiket {
	public static void pesanJumlahTiket(int jumlahTiket) {
 		// Asumsi jumlah tiket yang tersedia (boleh diganti)
     int tiketTersedia = 100;
     
     // To DO : Assertion untuk memastikan jumlah pemesanan lebih dari 0
     assert (jumlahTiket > 0) : "jumlah pemesanan lebih dari 0";

     // To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
     assert (jumlahTiket <= tiketTersedia) : "jumlah pemesanan tidak melebihi tiket yang tersedia";

    System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
}

	public static void isEWallet(int EWallet) {
        // To Do : Memeriksa apakah index e-wallet yang dipilih valid
        assert (EWallet >= 1 && EWallet <= 4) : "Indeks e-wallet tidak valid";

		// To Do : Assertion untuk memastikan e-wallet yang dipilih valid
        assert(!getEWallet(EWallet).isEmpty()): "Pilihan e-wallet tidak valid";

     System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
       		return "OVO";
			case 2:
       		return "GoPay";
			case 3:
       		return "DANA";
			case 4:
       		return "LinkAja";
			default:
       		return "";
		}
	}
}

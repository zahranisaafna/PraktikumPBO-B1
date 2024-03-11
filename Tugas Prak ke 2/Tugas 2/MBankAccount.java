/*Nama : Zahra Nisaa' Fitria Nur'Afifah
 *NIM : 24060122140162
 *Tanggal : 11 Maret 2024
 * File : MBankAccount.java
 */

 public class MBankAccount {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount(1000);
        System.out.println("Saldo sebelum transaksi: " + BA.getBalance());
        System.out.println("Deposit sejumlah "+ BA.deposit(500) + " berhasil.  Saldo saat ini: " + BA.getBalance());
        System.out.println("Penarikan sejumlah " + BA.withdraw(200) + " berhasil.  Saldo saat ini: " + BA.getBalance());
        System.out.println("Saldo setelah transaksi: " + BA.getBalance());
    }
 
    

 }

/*Nama : Zahra Nisaa' Fitria Nur'Afifah
 *NIM : 24060122140162
 *Tanggal : 11 Maret 2024
 * File : BankAccount.java
 */
public class BankAccount {
    //deklarasi atribut
    private float balance;
    public float jumlah;
    
    //deklarasi konstruktor
    public BankAccount(){
        balance = 0;
    }

    //deklarasi overloading konstruktor
    public BankAccount(float initialBalance){
        balance = initialBalance;
    }

    //deklarasi metode
    public float deposit(float jumlah){
        balance+=jumlah;
        return jumlah;
    }
    
    public float withdraw(float jumlah){
        if (jumlah <= balance) {
            balance-=jumlah;
        }
        return jumlah;
    }
    public float getBalance(){
        return balance;
    }
   
}
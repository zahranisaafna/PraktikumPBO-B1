/*
 * File : KontrolSenjata.java 05/07/2024
 * Penulis :  Zahra Nisaa' Fitria Nur' Afifah
 * NIM : 24060122140162
 */
package latihanMedium;

public class KontrolSenjata{
    private Senjata senjata;

    public KontrolSenjata (Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);

    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (! isAdaPeluru()){
            System.out.println("Peluru Habis");
        }
        else{
            int i = senjata.getPeluru();
            while(jumlah > 0){
                if (isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(i-1);
                    i--;
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                jumlah--;
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());

        

        }
    }
}

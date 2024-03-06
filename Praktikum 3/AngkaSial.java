/*
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13) {
            throw new AngkaSialException();
            
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/*
 * Pertanyaan:
 * Ketika eksepsi terjadi,apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * Jawaban :
 * pada baris ke 12 System.out.println(angka+" bukan angka sial") tidak dieksekusi 
 * karena program dialihkan dan dieksekusi ke AngkaSialException.java
 * 
 * Pertanyaan:
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * Jawaban:
 * baris 21 catch(AngkaSialException ase) dieksekusi. 
 * Karena pada baris ke 19  as.cobaAngka(13) dengan input 13
 * dan pada AngkaSial masuk ke throw new sehingga menjalankan catch
 *  
 */
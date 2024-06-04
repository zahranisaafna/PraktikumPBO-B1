/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 04/06/2024
 * NIM = 24060121140162
 * File LambdaList.java
 * Deskripsi: Ekspresi lambda pada List, digunakan sebagai parameter pada method.
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String>mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
    
}

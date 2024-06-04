/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 04/06/2024
 * NIM = 24060121140162
 * File LambdaMap.java
 * Deskripsi: Ekspresi lambda pada List, digunakan sebagai parameter pada method.
 */
import java.util.Map;
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("162", "Zino");
        mahasiswaMap.put("080", "Naa");
        mahasiswaMap.put("082", "BlukBluk");
        mahasiswaMap.put("174", "Nela");

        // Lambda expression used to print key and value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));

    }
}

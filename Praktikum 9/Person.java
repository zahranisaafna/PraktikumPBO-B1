/*
 * File : Person.java
 * Deskripsi : Person database model
 * Nama : Zahra Nisaa' Fitria Nur'Afifah 21/05/2024
 * NIM : 24060122140162
 */
public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

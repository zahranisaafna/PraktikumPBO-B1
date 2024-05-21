/*
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Nama : Zahra Nisaa' Fitria Nur'Afifah 21/05/2024
 * NIM : 24060122140162
 */
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO (PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}

/*
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Nama : Zahra Nisaa' Fitria Nur'Afifah 21/05/2024
 * NIM : 24060122140162
 */
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m =new DAOManager();
        m.setPersonDAO(new MYSQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

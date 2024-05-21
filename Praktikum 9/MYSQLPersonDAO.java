/*
 * File : MYSQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * Nama : Zahra Nisaa' Fitria Nur'Afifah 21/05/2024
 * NIM : 24060122140162
 */
import java.sql.*;

public class MYSQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi, nama, db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","");
        //Kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
        
    }
    
}

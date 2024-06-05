/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.utilities.MysqlUtility;
import jdbc.model.Mahasiswa;


/**
 *
 * @author nisaa
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                
            } catch (ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        
        return koneksi;
    }
}

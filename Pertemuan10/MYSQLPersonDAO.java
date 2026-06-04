import java.sql.*;

/**
 * File         : MySQLPersonDAO.java
 * Deskripsi    : implementasi PersonDAO untuk MySQL
 * Pembuat      : Quinta Aurabiansyah / 24060124120016
 * Tanggal      : Senin, 25 Mei 2026
 */

public class MYSQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Ganti 'password_kamu_disini' dengan password MySQL Workbench milikmu
        Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/pbo", "root", "Septiano");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}
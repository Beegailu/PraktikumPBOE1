/**
 * File         : MainDAO.java
 * Deskripsi    : Main program untuk akses DAO
 * Pembuat      : Quinta Aurabiansyah / 24060124120016
 * Tanggal      : Rabu, 3 Juni 2026
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MYSQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data person berhasil disimpan ke database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
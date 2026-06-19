/**
 * File         : DAOManager.java
 * Deskripsi    : pengelola DAO dalam program
 * Pembuat      : Quinta Aurabiansyah / 24060124120016
 * Tanggal      : Rabu, 25 Mei 2026
 */

public class DAOManager {
    private PersonDAO personDAO; 

    public void setPersonDAO(PersonDAO person) {
        personDAO = person; 
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
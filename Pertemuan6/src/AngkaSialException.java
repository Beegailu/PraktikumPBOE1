/* Nama File    : AngkaSialException.java
   Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
/* Nama File  : Kucing.java
   Deskripsi   : Subclass Kucing, override gerak() & bersuara(), plus metode scratch()
   Pembuat     : Quinta Aurabiansyah/24060124120016
   Tanggal     : 30 April 2026
*/

public class Kucing extends Anabul {

  // Konstruktor
  public Kucing(String nama, int umur, String jenisKelamin, String warna) {
    super(nama, umur, jenisKelamin, warna);
  }

  // Override metode gerak() dari superclass Anabul
  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan melata.");
  }

  // Override metode bersuara() dari superclass Anabul
  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: meong!!!");
  }

  // Metode khusus Kucing
  public void scratch() {
    System.out.println(nama + " sedang mencakar.");
  }
}
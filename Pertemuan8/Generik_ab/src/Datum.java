/* Nama File  : Datum.java
   Deskripsi   : Kelas generik Datum<T> untuk menyimpan objek dari kelas lain
                 dengan tipe data generik T. Kelas ini memiliki atribut isi,
                 konstruktor, selektor, dan mutator.
   Pembuat     : Quinta Aurabiansyah/24060124120016
   Tanggal     : 30 April 2026
*/

public class Datum<T> {
  // Atribut
  private T isi;

  // Konstruktor
  public Datum(T isi) {
    this.isi = isi;
  }

  // Selektor (getter)
  public T getIsi() {
    return isi;
  }

  // Mutator (setter)
  public void setIsi(T isi) {
    this.isi = isi;
  }
}
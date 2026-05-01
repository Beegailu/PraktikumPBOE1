/* Nama File   : MainGenerik.java
   Deskripsi   : Kelas MainGenerik untuk menguji kelas Datum<T> dan metode generik
                 dalam kelas ContohMetodeGenerik. Kelas ini juga mendemonstrasikan
                 penukaran isi dua objek Datum<T>.
   Pembuat     : Quinta Aurabiansyah/24060124120016
   Tanggal     : 30 April 2026
*/

public class MainGenerik {
  public static void main(String[] args) {
    // Buat Datum untuk tiap jenis Anabul
    Datum<Anabul> dk = new Datum<>(new Kucing("Kitty", 2, "Betina", "Putih"));
    Datum<Anabul> da = new Datum<>(new Anjing("Doggy", 3, "Jantan", "Cokelat"));
    Datum<Anabul> db = new Datum<>(new Burung("Tweety", 1, "Betina", "Kuning"));

    // Simulasi masing‑masing dengan metode generik
    ContohMetodeGenerik.simulasikan(dk);
    ContohMetodeGenerik.simulasikan(da);
    ContohMetodeGenerik.simulasikan(db);

    // Demonstrasi penukaran isi
    System.out.println("Sebelum tukar: " + dk.getIsi().getNama() + " & " + da.getIsi().getNama());
    ContohMetodeGenerik.tukarIsi(dk, da);
    System.out.println("Sesudah tukar: " + dk.getIsi().getNama() + " & " + da.getIsi().getNama());
  }
}
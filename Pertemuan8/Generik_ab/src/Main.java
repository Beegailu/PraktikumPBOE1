/* Nama File : Main.java
   Deskripsi : Demo polimorfisme + simulasi perubahan data lengkap
   Pembuat     : Quinta Aurabiansyah/24060124120016
   Tanggal     : 30 April 2026
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // 1. Inisialisasi koleksi Anabul
    ArrayList<Anabul> koleksi = new ArrayList<>();
    koleksi.add(new Kucing("Kitty", 2, "Betina", "Putih"));
    koleksi.add(new Anjing("Blacky", 3, "Jantan", "Cokelat"));
    koleksi.add(new Burung("Anton", 1, "Betina", "Kuning"));

    // 2. Simulasi awal 
    System.out.println("=== SIMULASI AWAL ===");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.info();
      a.gerak();
      a.bersuara();
      a.makan();
      a.tidur();
      if (a instanceof Kucing)
        ((Kucing) a).scratch();
      else if (a instanceof Anjing)
        ((Anjing) a).fetch();
      else if (a instanceof Burung)
        ((Burung) a).terbangTinggi();
      System.out.println();
    }

    // 3. Simulasi perubahan data
    System.out.println("=== SIMULASI PERUBAHAN DATA ===");
    koleksi.get(0).setNama("Kitty Missy");
    koleksi.get(0).setUmur(3);
    koleksi.get(1).setWarna("Hitam");
    koleksi.get(2).setJenisKelamin("Jantan");
    koleksi.get(2).setUmur(2);

    // 4. Tampilkan state setelah perubahan 
    System.out.println("\n--- STATE SETELAH PERUBAHAN ---");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.info();
    }

    // 5. Simulasi penuh setelah perubahan
    System.out.println("\n=== SIMULASI SETELAH PERUBAHAN ===");
    for (Anabul a : koleksi) {
      System.out.println(">> " + a.getNama());
      a.gerak();
      a.bersuara();
      a.makan();
      a.tidur();

      // Simulasi aksi spesifik 
      if (a instanceof Kucing)
        ((Kucing) a).scratch();
      else if (a instanceof Anjing)
        ((Anjing) a).fetch();
      else if (a instanceof Burung)
        ((Burung) a).terbangTinggi();
      System.out.println();
    }
  }
}
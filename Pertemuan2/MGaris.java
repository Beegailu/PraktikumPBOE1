/* Nama File : MGaris.java
  Deskripsi : Menguji coba fungsi dan manipulasi objek dari kelas Garis
  Creator   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 4 Maret 2026
*/

public class MGaris {
  public static void main(String[] args) {
    // 1. Uji konstruktor default
    System.out.println("=== Pengujian Konstruktor Default ===");
    Garis g1 = new Garis();
    System.out.println("Garis g1:");
    g1.printGaris();
    System.out.println("Panjang g1: " + g1.getPanjang());
    System.out.println("Gradien g1: " + g1.getGradien());
    System.out.print("Titik Tengah g1: ");
    g1.getTitikTengah().printTitik();
    System.out.println();

    // 2. Uji konstruktor dengan parameter
    System.out.println("=== Pengujian Konstruktor dengan Parameter ===");
    Titik t1 = new Titik(2, 3);
    Titik t2 = new Titik(8, 11);
    Garis g2 = new Garis(t1, t2);
    System.out.println("Garis g2:");
    g2.printGaris();
    System.out.println("Panjang g2: " + g2.getPanjang());
    System.out.println("Gradien g2: " + g2.getGradien());
    System.out.print("Titik Tengah g2: ");
    g2.getTitikTengah().printTitik();
    System.out.println();

    // 3. Uji fungsi isSejajar
    System.out.println("=== Pengujian isSejajar (False Case) ===");
    Garis g3 = new Garis(new Titik(0, 0), new Titik(6, 10)); 
    System.out.println("Garis g2 dan g3 sejajar? " + g2.isSejajar(g3));
    System.out.println();

    System.out.println("=== Pengujian isSejajar (True Case) ===");
    Garis g5 = new Garis(new Titik(0, 0), new Titik(2, 2)); 
    Garis g6 = new Garis(new Titik(1, 1), new Titik(3, 3)); 
    System.out.println("Garis g5 dan g6 sejajar? " + g5.isSejajar(g6));
    System.out.println();

    // 4. Uji fungsi isTegakLurus
    System.out.println("=== Pengujian isTegakLurus (False Case) ===");
    Garis g4 = new Garis(new Titik(0, 0), new Titik(6, -8)); 
    System.out.println("Garis g2 dan g4 tegak lurus? " + g2.isTegakLurus(g4));
    System.out.println();

    System.out.println("=== Pengujian isTegakLurus (True Case) ===");
    Garis g7 = new Garis(new Titik(0, 0), new Titik(2, 2)); 
    Garis g8 = new Garis(new Titik(0, 0), new Titik(2, -2)); 
    System.out.println("Garis g7 dan g8 tegak lurus? " + g7.isTegakLurus(g8));
    System.out.println();

    // 5. Uji Print Persamaan Garis
    System.out.println("=== Pengujian Print Persamaan Garis ===");
    System.out.print("Persamaan garis g2: ");
    g2.printPersamaanGaris();
    System.out.println();

    // 6. Tampilkan jumlah objek Garis yang dibuat (menggunakan counterGaris)
    System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());

    // Contoh: garis yang dibuat dari titik (-2,0) dan (0,4) mempunyai persamaan y = 2x + 4.
    Titik a = new Titik(-2, 0);
    Titik b = new Titik(0, 4);
    Garis gEx = new Garis(a, b);
    System.out.print("Persamaan garis dari titik (-2,0) dan (0,4): ");
    gEx.printPersamaanGaris();
    System.out.println();

  }
}
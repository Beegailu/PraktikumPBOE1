/* Nama File  : Teman.java
   Deskripsi  : Kelas Teman sebagai implementasi antrean (Queue) dari objek Anabul
                Merupakan representasi dari Lanabul (koleksi antrean Anabul)
   Pembuat    : Quinta Aurabiansyah/24060124120016
   Tanggal    : 14 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Teman {
    private Queue<Anabul> antrean;

    public Teman() {
        antrean = new LinkedList<>();
    }

    // i. getNbelm() - mengembalikan jumlah elemen dalam antrean
    public int getNbelm() {
        return antrean.size();
    }

    // ii. enqueueAnabul(anabul) - menambah elemen di akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        antrean.add(anabul);
    }

    // iii. isMember(anabul) - mengecek apakah anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return antrean.contains(anabul);
    }

    // iv. getAnabul() - mengambil data anabul pertama tanpa mengeluarkan
    public Anabul getAnabul() {
        return antrean.peek();
    }

    // v. dequeueAnabul() - mengambil dan mengeluarkan anabul pertama dari antrean
    public Anabul dequeueAnabul() {
        return antrean.poll();
    }

    // Getter antrean (untuk keperluan iterasi di kelas lain)
    public Queue<Anabul> getAntrean() {
        return antrean;
    }
}
/* Nama File    : Teman.java
   Deskripsi    : Kelas yang mengelola koleksi objek String (nama teman) menggunakan 
                  Java Collection (List). Menyediakan berbagai operator untuk manipulasi data.
   Pembuat      : Quinta Aurabiansyah/24060124120016
   Tanggal      : 07 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // a. Mendapatkan jumlah elemen
    public int getNbelm() {
        return Lnama.size();
    }

    // b. Mendapatkan nama berdasarkan indeks
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    // c. Mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    // d. Menambah nama baru
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = Lnama.size();
    }

    // e. Menghapus nama tertentu
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm = Lnama.size();
        }
    }

    // f. Memeriksa apakah sebuah nama ada dalam list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. Mengganti nama lama dengan nama baru
    public void gantiNama(String namaLama, String namaBaru) {
        int index = Lnama.indexOf(namaLama);
        if (index != -1) {
            Lnama.set(index, namaBaru);
        }
    }

    // h. Menghitung kemunculan nama tertentu
    public int countNama(String nama) {
        int count = 0;
        for (String s : Lnama) {
            if (s.equalsIgnoreCase(nama)) {
                count++;
            }
        }
        return count;
    }

    // i. Menampilkan semua nama teman
    public void showTeman() {
        System.out.println("Daftar Teman (" + getNbelm() + "):");
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}
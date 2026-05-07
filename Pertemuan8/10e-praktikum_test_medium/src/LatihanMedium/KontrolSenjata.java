/* Nama File : KontrolSenjata.java
   Deskripsi : Kelas yang mengontrol senjata
   Pembuat : Quinta Aurabiansyah/24060124120016
   Tanggal : 07 Mei 2026
*/

package LatihanMedium;

public class KontrolSenjata {
  private Senjata senjata;

  public KontrolSenjata(Senjata s) {
    this.senjata = s;
  }

  public boolean isAdaPeluru() {
    return senjata.getPeluru() > 0;
  }

  public void isiPeluru(int jumlah) {
    senjata.setPeluru(senjata.getPeluru() + jumlah);
    System.out.println(">> Peluru berhasil ditambah: " + jumlah);
  }

  public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");
    for (int i = 0; i < jumlah; i++) {
      if (isAdaPeluru()) {
        System.out.println(senjata.getBunyi());
        senjata.setPeluru(senjata.getPeluru() - 1);
      } else {
        System.out.println("Gagal tembak, Peluru Habis");
      }
    }
    System.out.println(">> Peluru sisa: " + senjata.getPeluru());
  }

  public String menusuk() {
    if (senjata.isMenusuk()) {
      return "Menusuk berhasil";
    } else {
      return "Bayonet belum dipasang";
    }
  }

  public void pasangBayonet() {
    senjata.setMenusuk(true);
  }
}
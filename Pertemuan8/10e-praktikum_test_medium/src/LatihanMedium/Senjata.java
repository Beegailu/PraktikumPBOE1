/* Nama File : Senjata.java
   Deskripsi : Kelas yang merepresentasikan senjata
   Pembuat : Quinta Aurabiansyah/24060124120016
   Tanggal : 07 Mei 2026
*/

package LatihanMedium;

public class Senjata {
  private String bunyi;
  private boolean menusuk;
  private int peluru;

  public Senjata(String bunyi) {
    this.bunyi = bunyi;
    this.menusuk = false;
    this.peluru = 0;
  }

  public String getBunyi() {
    return bunyi;
  }

  public int getPeluru() {
    return peluru;
  }

  public boolean isMenusuk() {
    return menusuk;
  }

  public void setBunyi(String bunyi) {
    this.bunyi = bunyi;
  }

  public void setMenusuk(boolean menusuk) {
    this.menusuk = menusuk;
  }

  public void setPeluru(int peluru) {
    this.peluru = peluru;
  }
}
/* Nama File : BangunDatar.java
  Deskripsi : Kelas abstrak BangunDatar merupakan kelas dasar yang merepresentasikan bangun datar.
  Pembuat   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 25 April 2026
*/

public abstract class BangunDatar {
  protected int jmlSisi;
  protected String warna;
  protected String border;
  private static int counterBangunDatar = 0;

  // Konstruktor 
  public BangunDatar() {
    counterBangunDatar++;
  }

  public BangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    counterBangunDatar++;
  }

  // Abstract methods 
  public abstract double getLuas();

  public abstract double getKeliling();

  public boolean isEqualLuas(BangunDatar X) {
    return this.getLuas() == X.getLuas();
  }

  public boolean isEqualKeliling(BangunDatar X) {
    return this.getKeliling() == X.getKeliling();
  }

  public static void printCounterBangunDatar() {
    System.out.println("Jumlah objek BangunDatar yang telah dibuat: " + counterBangunDatar);
  }

  // Getter dan setter 
  public int getJmlSisi() {
    return jmlSisi;
  }

  public void setJmlSisi(int jmlSisi) {
    this.jmlSisi = jmlSisi;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public String getBorder() {
    return border;
  }

  public void setBorder(String border) {
    this.border = border;
  }

  // Metode untuk menampilkan informasi
  public void printInfo() {
    System.out.println("Jumlah sisi: " + jmlSisi);
    System.out.println("Warna: " + warna);
    System.out.println("Border: " + border);
  }
}


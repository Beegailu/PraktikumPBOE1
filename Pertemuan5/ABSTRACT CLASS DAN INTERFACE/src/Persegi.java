/* Nama File : Persegi.java
  Deskripsi : Berisi atribut dan method dalam class Persegi yang merupakan turunan dari BangunDatar
  Pembuat   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 25 April 2026
*/

public class Persegi extends BangunDatar implements IResize {
  private double sisi;

  // Konstruktor 
  public Persegi() {
    setJmlSisi(4);
  }


  public Persegi(double sisi) {
    setJmlSisi(4);
    this.sisi = sisi;
  }

  public Persegi(double sisi, String warna, String border) {
    this.jmlSisi = 4;
    this.warna = warna;
    this.border = border;
    this.sisi = sisi;
  }

  // Getter dan Setter sisi
  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  // Method 
  public double getLuas() {
    return sisi * sisi;
  }

  public double getKeliling() {
    return 4 * sisi;
  }

  public double getDiagonal() {
    return Math.sqrt(2) * sisi;
  }

  // Override method printInfo() dari BangunDatar
  @Override
  public void printInfo() {
    // Memanggil printInfo() dari BangunDatar untuk menampilkan jmlSisi, warna, dan border
    super.printInfo();

    // Nambahin informasi sisi, luas, dan keliling
    System.out.println("Sisi        : " + sisi);
    System.out.println("Luas        : " + getLuas());
    System.out.println("Keliling    : " + getKeliling());
  }

  // Implementasi method dari interface IResize
  @Override
  public void zoomIn() {
    // Memperbesar ukuran persegi sebesar 10%
    this.sisi = this.sisi * 1.1;
  }

  @Override
  public void zoomOut() {
    // Memperkecil ukuran persegi sebesar 10%
    this.sisi = this.sisi * 0.9;
  }

  @Override
  public void zoom(double percent) {
    this.sisi = this.sisi * (percent / 100);  // percent = 100 berarti tidak berubah, 200 berarti 2x lipat, 50 berarti 1/2 kali
  }

  public static void printCounterBangunDatar() {
    System.out.println("Ini dari kelas Persegi");
  }
}
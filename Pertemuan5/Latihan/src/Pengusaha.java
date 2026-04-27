/* Nama File : Pengusaha.java
  Deskripsi : Kelas Pengusaha merupakan subclass dari kelas Manusia dan mengimplementasi interface Pajak.
  Pembuat   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 27 April 2026
*/

import java.util.Calendar;
import java.util.Date;

public class Pengusaha extends Manusia implements Pajak {
  private String npwp;
  private static int counterPengusaha = 0;

  // Konstruktor tanpa parameter
  public Pengusaha() {
    this.npwp = "Belum diisi";
    counterPengusaha++;
  }

  // Konstruktor dengan parameter
  public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.npwp = npwp;
    counterPengusaha++;
  }

  @Override
  public double hitungPajak() {
    return 0.15 * getPendapatan(); // 15% of pendapatan
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    // Add B (B = 1, diambil dari digit NIM ke-13)
    return years + 1;
  }

  @Override
  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("NPWP: " + npwp);
  }

  // Getters and setters
  public String getNpwp() {
    return npwp;
  }

  public void setNpwp(String npwp) {
    this.npwp = npwp;
  }

  public static int getCounterPengusaha() {
    return counterPengusaha;
  }
}
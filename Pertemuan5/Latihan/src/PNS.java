/* Nama File : PNS.java
  Deskripsi : Kelas PNS merupakan subclass dari kelas Manusia dan mengimplementasi interface Pajak.
  Pembuat   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 27 April 2026
*/

import java.util.Calendar;
import java.util.Date;

public class PNS extends Manusia implements Pajak {
  private String nip;
  private static int counterPns = 0;

  // Konstruktor 
  public PNS() {
    this.nip = "Belum diisi";
    counterPns++;
  }

  public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.nip = nip;
    counterPns++;
  }

  public PNS(String nama, Date tgl_mulai_kerja, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, "Belum diisi", pendapatan);
    this.nip = nip;
    counterPns++;
  }

  @Override
  public double hitungPajak() {
    return 0.10 * getPendapatan(); 
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    return years + 5;
  }

  @Override
  public void cetakInfo() {
    super.cetakInfo();
    System.out.println("NIP: " + nip);
  }

  // Getter and setter
  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public static int getCounterPNS() {
    return counterPns;
  }
}
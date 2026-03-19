/*Nama File : Dosen.java
  Deskripsi : Kelas Dosen merupakan kelas anak yang berisi atribut dan method yang digunakan oleh kelas anak
  Pembuat   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 17/03/2026
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
  protected String fakultas;

  // Constructor
  public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
    super(nip, nama, tanggalLahir, tmt, gajiPokok);
    this.fakultas = fakultas;
  }

  // Menampilkan informasi dosen, ditambah fakultas
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Fakultas   : " + fakultas);
  }
}
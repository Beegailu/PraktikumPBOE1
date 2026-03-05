import java.util.ArrayList;

public class Mahasiswa {
  /************** ATRIBUT **************/
  private String nim;
  private String nama;
  private String prodi;
  ArrayList<MataKuliah> listMatkul; 
  private Dosen dosenWali;
  private Kendaraan kendaraan;

  /************** METHOD **************/
  public Mahasiswa() {
    this.nim = "";
    this.nama = "";
    this.prodi = "";
    this.listMatkul = new ArrayList<MataKuliah>();
    this.dosenWali = new Dosen();
    this.kendaraan = new Kendaraan();
  }

  // Konstruktor dengan parameter
  public Mahasiswa(String nim, String nama, String prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    this.listMatkul = new ArrayList<MataKuliah>();
    this.dosenWali = new Dosen();
    this.kendaraan = new Kendaraan();
  }

  // Selektor (getter)
  public String getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public String getProdi() {
    return prodi;
  }

  public ArrayList<MataKuliah> getListMatkul() {
    return listMatkul;
  }

  public Dosen getDosenWali() {
    return dosenWali;
  }

  public Kendaraan getKendaraan() {
    return kendaraan;
  }

  // Mutator (setter)
  public void setNim(String nim) {
    this.nim = nim;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
    this.listMatkul = listMatkul;
  }

  public void setDosenWali(Dosen dosenWali) {
    this.dosenWali = dosenWali;
  }

  public void setKendaraan(Kendaraan kendaraan) {
    this.kendaraan = kendaraan;
  }

  public void addMatKul(MataKuliah matkul) {
    listMatkul.add(matkul);
  }

  public int getJumlahSKS() {
    int totalSks = 0;
    // Looping untuk menghitung total SKS
    for (MataKuliah matkul : listMatkul) {
      totalSks += matkul.getSks();
    }
    return totalSks;
  }

  public int getJumlahMatKul() {
    return listMatkul.size();
  }

  public void printMhs() {
    System.out.println("NIM : " + nim);
    System.out.println("Nama : " + nama);
    System.out.println("Prodi : " + prodi);
  }

  // Method printDetailMhs() untuk
  // menampilkan nim, nama, prodi, daftar mata
  // kuliah yang diambil, data dosen wali, serta
  // data kendaraan yang dimiliki mahasiswa.
  public void printDetailMhs() {
    printMhs();
    System.out.println("Daftar Mata Kuliah : ");
    for (MataKuliah matkul : listMatkul) {
      System.out.println("  - " + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
    }

    System.out.println("Dosen Wali : ");
    System.out.println("  - NIP : " + dosenWali.getNIPDosen());
    System.out.println("  - Nama : " + dosenWali.getNamaDosen());
    System.out.println("  - Prodi : " + dosenWali.getProdiDosen());
    
    System.out.println("Kendaraan : ");
    System.out.println("  - No. Plat : " + kendaraan.getNoPlat());
    System.out.println("  - Jenis : " + kendaraan.getJenis());
  }
}
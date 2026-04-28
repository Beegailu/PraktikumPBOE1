/* Nama File    : Overloading.java
   Deskripsi    : Menampilkan program demonstrasi Polimorfisme Ad Hoc Overloading
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
*/
 
// Kelas Mahasiswa 
class Mahasiswa2 {
    private String nim;
    private String nama;
    private String programStudi;
 
    // 2c. Konstruktor tanpa parameter (default) 
    public Mahasiswa2() {
        this.nim          = "-999";
        this.nama         = "n/a";
        this.programStudi = "n/a";
    }
 
    // 2d. Konstruktor dengan tiga parameter 
    public Mahasiswa2(String nim, String nama, String programStudi) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
    }
 
    // 2e. Konstruktor copy / kloning 
    public Mahasiswa2(Mahasiswa2 other) {
        this.nim          = other.nim;
        this.nama         = other.nama;
        this.programStudi = other.programStudi;
    }
 
    //Getter & Setter
    public String getNim()          { return nim; }
    public String getNama()         { return nama; }
    public String getProgramStudi() { return programStudi; }
    public void   setNim(String nim)   { this.nim  = nim; }
    public void   setNama(String nama) { this.nama = nama; }
 
    // 2a. Overloading setProgramStudi 
    // Varian 1 : tanpa parameter 
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }
 
    // Varian 2 : satu parameter String
    public void setProgramStudi(String ps) {
        this.programStudi = ps;
    }
 
    // Varian 3 : satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa2 other) {
        this.programStudi = other.programStudi;
    }
 
    // Tampil 
    public void tampil() {
        System.out.println("  NIM          : " + nim);
        System.out.println("  Nama         : " + nama);
        System.out.println("  Program Studi: " + programStudi);
    }
}
 
// Main class
public class Overloading {
    public static void main(String[] args) {
 
        System.out.println("=== 2c. Konstruktor Default ===");
        Mahasiswa2 mDefault = new Mahasiswa2();
        mDefault.tampil();
 
        System.out.println("\n=== 2d. Konstruktor Tiga Parameter ===");
        Mahasiswa2 m1 = new Mahasiswa2("A001", "Budi Santoso", "Informatika");
        Mahasiswa2 m2 = new Mahasiswa2("A002", "Sari Dewi",   "Sistem Informasi");
        m1.tampil();
        System.out.println("---");
        m2.tampil();
 
        System.out.println("\n=== 2b. Overloading setProgramStudi ===");
 
        // Varian 1 – tanpa parameter
        Mahasiswa2 mA = new Mahasiswa2("B001", "Andi", "TI");
        System.out.println("Sebelum setProgramStudi():");
        mA.tampil();
        mA.setProgramStudi();
        System.out.println("Setelah setProgramStudi() [tanpa param]:");
        mA.tampil();
 
        // Varian 2 – satu parameter String
        System.out.println("---");
        Mahasiswa2 mB = new Mahasiswa2("B002", "Bela", "");
        mB.setProgramStudi("Teknik Elektro");
        System.out.println("Setelah setProgramStudi(String):");
        mB.tampil();
 
        // Varian 3 – satu parameter objek Mahasiswa lain
        System.out.println("---");
        Mahasiswa2 mC = new Mahasiswa2("B003", "Citra", "");
        mC.setProgramStudi(m1);   // ambil prodi dari m1
        System.out.println("Setelah setProgramStudi(Mahasiswa) [ambil dari m1]:");
        mC.tampil();
 
        // 2e. Konstruktor kloning 
        System.out.println("\n=== 2e. Konstruktor Kloning ===");
        Mahasiswa2 mKlon = new Mahasiswa2(m1);
        System.out.println("Objek asli (m1):");
        m1.tampil();
        System.out.println("Objek klon:");
        mKlon.tampil();
        
        mKlon.setNim("KLON-999");
        System.out.println("m1.nim   = " + m1.getNim());
        System.out.println("klon.nim = " + mKlon.getNim());
    }
}
/* Nama File    : InclusionSeminar.java
   Deskripsi    : Menampilkan program demonstrasi Polimorfisme Universal Inclusion – Seminar
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 28 April 2026
*/

// 4a. Kelas Induk: CivitasAkademika
abstract class CivitasAkademika {
    protected String nama;
 
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }
 
    public String getNama() { return nama; }
 
    public abstract String getNomor();
}

// 4a. Kelas Turunan: Dosen
class Dosen extends CivitasAkademika {
    private String nip;
 
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }
 
    @Override
    public String getNomor() { return nip; }
 
    public String getNip() { return nip; }
}
 
// 4a. Kelas Turunan: Mhs
class MahasiswaSeminar extends CivitasAkademika {
    private String nim;
    private Dosen  dosenWali;
 
    public MahasiswaSeminar(String nim, String nama) {
        super(nama);
        this.nim      = nim;
        this.dosenWali = null;
    }
 
    @Override
    public String getNomor() { return nim; }
 
    public String getNim() { return nim; }
 
    //4i. setWali 
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }
 
    //4j. tampilDataMahasiswa 
    public void tampilDataMahasiswa() {
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "(belum ada)";
        System.out.println("  NIM          : " + nim);
        System.out.println("  Nama         : " + nama);
        System.out.println("  Dosen Wali   : " + namaWali);
    }
}
 

// 4b. Kelas Aplikator: Seminar
class Seminar {
    private static final int KAPASITAS = 100;
    private CivitasAkademika[] pesertas;   // larik statis
    private int banyakPeserta;
 
    public Seminar() {
        pesertas      = new CivitasAkademika[KAPASITAS];
        banyakPeserta = 0;   // inisialisasi nol
    }
 
    //4c. countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }
 
    //4d. registrasi 
    public void registrasi(CivitasAkademika ca) {
        if (banyakPeserta < KAPASITAS) {
            pesertas[banyakPeserta] = ca;   // kontigu, indeks tidak melompat
            banyakPeserta++;
            System.out.println("  Terdaftar: [" + ca.getNomor() + "] " + ca.getNama());
        } else {
            System.out.println("  Seminar penuh! " + ca.getNama() + " tidak bisa didaftarkan.");
        }
    }
 
    //4g. tampilPeserta 
    public void tampilPeserta() {
        System.out.println("  No.  Nomor         Nama");
        System.out.println("  ─────────────────────────────────────────");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.printf("  %-4d %-13s %s%n",
                (i + 1),
                pesertas[i].getNomor(),
                pesertas[i].getNama());
        }
    }
 
    //4h. countMahasiswa 
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }
}
 

// Main Program
public class InclusionSeminar {
    public static void main(String[] args) {
 
        //4e. 2 Dosen dan 5 Mahasiswa 
        Dosen d1 = new Dosen("NIP001", "Dr. Budi Hartono");
        Dosen d2 = new Dosen("NIP002", "Prof. Siti Rahayu");
 
        MahasiswaSeminar mhs1 = new MahasiswaSeminar("NIM001", "Andi Pratama");
        MahasiswaSeminar mhs2 = new MahasiswaSeminar("NIM002", "Bella Safira");
        MahasiswaSeminar mhs3 = new MahasiswaSeminar("NIM003", "Candra Wijaya");
        MahasiswaSeminar mhs4 = new MahasiswaSeminar("NIM004", "Dina Kusuma");
        MahasiswaSeminar mhs5 = new MahasiswaSeminar("NIM005", "Eko Nugroho");
 
        //4f. Registrasi ketujuh peserta 
        Seminar seminar = new Seminar();
        System.out.println("=== 4f. Registrasi Peserta ===");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);
 
        //4c. countPeserta 
        System.out.println("\n=== 4c. Jumlah Peserta ===");
        System.out.println("  Total peserta: " + seminar.countPeserta());
 
        //4g. tampilPeserta 
        System.out.println("\n=== 4g. Daftar Peserta ===");
        seminar.tampilPeserta();
 
        //4h. countMahasiswa
        System.out.println("\n=== 4h. Jumlah Mahasiswa (instanceof) ===");
        System.out.println("  Jumlah peserta mahasiswa: " + seminar.countMahasiswa());
 
        //4i. setWali 
        System.out.println("\n=== 4i. Set Dosen Wali ===");
        mhs1.setWali(d1);
        mhs2.setWali(d1);
        mhs3.setWali(d2);
        mhs4.setWali(d2);
        mhs5.setWali(d1);
        System.out.println("  Dosen wali berhasil diatur untuk semua mahasiswa.");
 
        //4j. tampilDataMahasiswa 
        System.out.println("\n=== 4j. Data Mahasiswa dan Dosen Wali ===");
        MahasiswaSeminar[] semuaMhs = {mhs1, mhs2, mhs3, mhs4, mhs5};
        for (MahasiswaSeminar mhs : semuaMhs) {
            System.out.println("  ─────────────────────────────────");
            mhs.tampilDataMahasiswa();
        }
        System.out.println("  ─────────────────────────────────");
    }
}
/* Nama File  : Piaraan.java
   Deskripsi  : Kelas Piaraan yang mengelola antrean hewan peliharaan (Anabul)
                 dengan berbagai operasi koleksi
   Pembuat    : Quinta Aurabiansyah/24060124120016
   Tanggal    : 14 Mei 2026
   
*/

public class Piaraan {
    private int nbelm;      
    private Teman lanabul;  

    // Konstruktor
    public Piaraan() {
        this.nbelm = 0;
        this.lanabul = new Teman();
    }

    // c.showAnabul: menampilkan nama-nama panggilan anabul dalam antrean
    public void showAnabul() {
        System.out.println("=== Daftar Nama Panggilan Anabul ===");
        if (lanabul.getNbelm() == 0) {
            System.out.println("(Antrean kosong)");
            return;
        }
        int urutan = 1;
        for (Anabul a : lanabul.getAntrean()) {
            System.out.println(urutan + ". " + a.getNama());
            urutan++;
        }
        System.out.println("Total: " + lanabul.getNbelm() + " hewan");
    }

    // d. countKucing: menghitung banyak keluarga kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : lanabul.getAntrean()) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing: menghitung total bobot keluarga kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0.0;
        for (Anabul a : lanabul.getAntrean()) {
            if (a instanceof Kucing k) {
                totalBobot += k.getBobot();
            }
        }
        return totalBobot;
    }

   
    // f.showJenisAnabul: menampilkan nama panggilan beserta jenis objeknya menggunakan getClass().getName()
    public void showJenisAnabul() {
        System.out.println("=== Daftar Nama dan Jenis Anabul ===");
        if (lanabul.getNbelm() == 0) {
            System.out.println("(Antrean kosong)");
            return;
        }
        int urutan = 1;
        for (Anabul a : lanabul.getAntrean()) {
            // getClass().getName() mengembalikan nama kelas lengkap
            System.out.println(urutan + ". Nama: " + a.getNama()
                    + " | Jenis: " + a.getClass().getName());
            urutan++;
        }
    }

    
    //Menambah anabul ke antrian
    public void tambahAnabul(Anabul anabul) {
        lanabul.enqueueAnabul(anabul);
        nbelm = lanabul.getNbelm();
    }

    // Getter
    public int getNbelm() {
        return lanabul.getNbelm();
    }

    public Teman getLanabul() {
        return lanabul;
    }

   
    // MAIN 
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("  DEMO KOLEKSI KELAS BENTUKAN");
        System.out.println("============================================\n");

        Piaraan klinik = new Piaraan();

        //Membuat objek Anabul 
        Kucing yumi    = new Kucing("Yumi",    2, "Betina", "Putih",   "Yumi",    3.5);
        Kucing swaggy = new Kucing("Swaggy", 3, "Jantan", "Abu-abu", "Aggy", 4.2);
        Kucing mimu     = new Kucing("Mimu",     1, "Betina", "Hitam",   "Imu",     2.8);
        Anjing blacky    = new Anjing("Blacky",    4, "Jantan", "Coklat","Blacky");
        Anjing jack      = new Anjing("Jack",      5, "Jantan", "Hitam", "Jack");
        Anabul anabul1  = new Kucing("Laey",   2, "Betina", "Putih", "Ley", 2.0);

        // Menambah ke antrean 
        klinik.tambahAnabul(yumi);
        klinik.tambahAnabul(swaggy);
        klinik.tambahAnabul(mimu);
        klinik.tambahAnabul(blacky);
        klinik.tambahAnabul(jack);
        klinik.tambahAnabul(anabul1);

        System.out.println(">>> Antrean berhasil dibuat dengan "+ klinik.getNbelm() + " hewan.\n");

        // Uji Teman (Lanabul) 
        Teman teman = klinik.getLanabul();
        System.out.println(" Uji Operator Teman ");
        System.out.println("i.   getNbelm()       : " + teman.getNbelm());
        System.out.println("iii. isMember(kitty)  : " + teman.isMember(yumi));
        System.out.println("iii. isMember(anabul1): " + teman.isMember(anabul1));
        System.out.println("iv.  getAnabul()      : " + teman.getAnabul());
        System.out.println();

        //c. showAnabul 
        klinik.showAnabul();
        System.out.println();

        // d. countKucing 
        System.out.println(" d. countKucing ");
        System.out.println("Jumlah kucing dalam antrean: " + klinik.countKucing());
        System.out.println();

        //e. bobotKucing 
        System.out.println(" e. bobotKucing ");
        System.out.printf("Total bobot kucing: %.1f kg%n", klinik.bobotKucing());
        System.out.println();

        //f. showJenisAnabul 
        klinik.showJenisAnabul();
        System.out.println();

        // Uji dequeueAnabul 
        System.out.println(" v. dequeueAnabul ");
        Anabul keluar = teman.dequeueAnabul();
        System.out.println("Hewan keluar dari antrean: " + keluar.getNama());
        System.out.println("Sisa antrean: " + teman.getNbelm() + " hewan");
        System.out.println();

        System.out.println(" Antrean setelah dequeue ");
        klinik.showAnabul();
    }
}
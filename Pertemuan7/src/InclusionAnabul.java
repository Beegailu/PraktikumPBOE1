/* Nama File    : InclusionAnabul.java
   Deskripsi    : Menampilkan program demonstrasi Polimorfisme Universal Inclusion – Anabul
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 28 April 2026
*/
 
//Kelas abstrak anabul
abstract class Anabul {
    protected String nama;
 
    public Anabul(String nama) {
        this.nama = nama;
    }
 
    public String getNama() { return nama; }
 
    // Method 
    public abstract void gerak();
    public abstract void bersuara();
}
 
//Kelas Anak: Kucing 
class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }
}
 
// Kelas Anak: Anjing 
class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) bersuara: Guk-Guk!");
    }
}
 
//Kelas Anak: Burung 
class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
 
    @Override
    public void gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }
 
    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara: Cuit!");
    }
}
 
//Program Utama 
public class InclusionAnabul {
    public static void main(String[] args) {
        // Polimorfisme: array bertipe induk, diisi objek berbagai anak
        Anabul[] anabuls = {
            new Kucing("Cimeng"),
            new Kucing("Tom"),
            new Anjing("Blacky"),
            new Anjing("Cil"),
            new Burung("Laufy")
        };
 
        System.out.println("====== Simulasi Bunyi dan Gerakan Anabul ======");
        for (Anabul a : anabuls) {
            System.out.println("----------------------------------------------");
            a.bersuara();
            a.gerak();
        }
        System.out.println("==============================================");
    }
}
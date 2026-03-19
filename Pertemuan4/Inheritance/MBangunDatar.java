/*Nama File : MBangunDatar.java
  Deskripsi : uji fungsi 
  Creator   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 12 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(5, "Putih", "Hitam");
        Persegi p2 = new Persegi(8, "Biru", "Merah");

        // Persegi
        System.out.println("Persegi 1");
        p1.printInfo();
        System.out.println("Sisi: " + p1.getSisi());

        System.out.println();

        System.out.println("Persegi 2");
        p2.printInfo();
        System.out.println("Sisi: " + p2.getSisi());

        System.out.println("====================");

        // Lingkaran
        Lingkaran l1 = new Lingkaran(7, "Kuning", "Hitam");
        Lingkaran l2 = new Lingkaran(14, "Hijau", "Abu");

        System.out.println("Lingkaran 1");
        l1.printInfo();
        System.out.println("Jari-jari: " + l1.getJari());

        System.out.println();

        System.out.println("Lingkaran 2");
        l2.printInfo();
        System.out.println("Jari-jari: " + l2.getJari());
    }
}
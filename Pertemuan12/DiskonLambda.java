/**
 * File         : DiskonLambda.java
 * Deskripsi    : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 * Pembuat      : Quinta Aurabiansyah / 24060124120016
 * Tanggal      : Kamis, 04 Juni 2026
*/

public class DiskonLambda {

    // Functional Interface
    interface IDiskon {
        public double hitungDiskon(int harga);
    }

    public static void main(String[] args) {

        // Tanpa lambda → menggunakan Anonymous Class
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan lambda → single expression
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan lambda → blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("=== Hasil Diskon untuk Harga Rp45.000 ===");
        System.out.println("Diskon Merdeka (30%): Rp" + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran (40%): Rp" + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa   (10%): Rp" + diskonBiasa.hitungDiskon(45000));
    }
}
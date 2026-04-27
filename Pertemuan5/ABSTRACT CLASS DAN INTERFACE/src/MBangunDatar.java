/* Nama File : MBangunData.java
    Deskripsi : Kelas utama untuk menjalankan program
    Pembuat   : Quinta Aurabiansyah/24060124120016
    Tanggal   : 26 April 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        final String SEPARATOR = "=================================================";

        // BAGIAN 1: Pembuatan Objek & Demonstrasi Abstract Class
        System.out.println("\nBAGIAN 1: PEMBUATAN OBJEK");
        System.out.println(SEPARATOR);

        // BangunDatar B1 = new BangunDatar(); // Error: Cannot instantiate the type | karena bangundatar seakarang abstrak

        BangunDatar P1 = new Persegi(7, "Biru", "Solid");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Double");

        Persegi P2 = new Persegi(5, "Pink", "Double");
        Lingkaran L2 = new Lingkaran(10, "Kuning", "Solid");

        // Informasi objek2
        System.out.println("\n1. Persegi reference BangunDatar (P1):");
        P1.printInfo();
        System.out.println("Luas     : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());

        System.out.println("\n2. Persegi reference Persegi (P2):");
        P2.printInfo();
        System.out.println("Luas     : " + P2.getLuas());
        System.out.println("Keliling : " + P2.getKeliling());
        System.out.println("Diagonal : " + P2.getDiagonal()); 

        System.out.println("\n3. Lingkaran reference BangunDatar (L1):");
        L1.printInfo();
        System.out.println("Luas     : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling());

        System.out.println("\n4. Lingkaran reference Lingkaran (L2):");
        L2.printInfo();
        System.out.println("Luas     : " + L2.getLuas());
        System.out.println("Keliling : " + L2.getKeliling());

        
        // BAGIAN 2: Demo isEqualLuas dan isEqualKeliling
        System.out.println("\n>> BAGIAN 2: PERBANDINGAN LUAS DAN KELILING");
        System.out.println(SEPARATOR);

        double sisiP3 = Math.sqrt(Math.PI * 3.5 * 3.5);
        Persegi P3 = new Persegi(sisiP3, "Hitam", "Solid");

        double diameterL3 = 2 * Math.sqrt(49 / Math.PI);
        Lingkaran L3 = new Lingkaran(diameterL3, "Putih", "Dashed");

        double sisiP4 = (Math.PI * 20) / 4;
        Persegi P4 = new Persegi(sisiP4, "Abu-abu", "Dotted");

        double diameterL4 = 20 / Math.PI;
        Lingkaran L4 = new Lingkaran(diameterL4, "Merah", "Double");

        // Tampilkan perbandingan luas
        System.out.println("\nPerbandingan Luas:");
        System.out.println("P1 = P2  : " + P1.isEqualLuas(P2)); 
        System.out.println("P1 = L1  : " + P1.isEqualLuas(L1)); 
        System.out.println("P3 ≈ L1  : " + P3.isEqualLuas(L1)); 
        System.out.println("P1 ≈ L3  : " + P1.isEqualLuas(L3)); 

        // Tampilkan perbandingan keliling
        System.out.println("\nPerbandingan Keliling:");
        System.out.println("P1 = P2  : " + P1.isEqualKeliling(P2)); 
        System.out.println("P1 = L1  : " + P1.isEqualKeliling(L1)); 
        System.out.println("P4 = L2  : " + P4.isEqualKeliling(L2)); 
        System.out.println("P2 ≈ L4  : " + P2.isEqualKeliling(L4)); 

        // Menampilkan nilai luas dan kelilingnya
        System.out.println("\n--- Nilai Luas dan Keliling ---");
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Luas L3: " + L3.getLuas());
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Luas P3: " + P3.getLuas());

        System.out.println("\nKeliling P2: " + P2.getKeliling());
        System.out.println("Keliling L4: " + L4.getKeliling());
        System.out.println("Keliling L2: " + L2.getKeliling());
        System.out.println("Keliling P4: " + P4.getKeliling());

        // BAGIAN 3: Demo Interface IResize
        System.out.println("\n>> BAGIAN 3: DEMO INTERFACE IRESIZE");
        System.out.println(SEPARATOR);

        // Demo dengan objek Persegi
        System.out.println("\nDemo IResize dengan Persegi P2:");
        System.out.println("Sisi awal: " + P2.getSisi());
        System.out.println("Luas awal: " + P2.getLuas());

        P2.zoomIn(); // Membesar 10%
        System.out.println("\nSetelah zoomIn():");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        P2.zoomOut(); // Mengecil 10%
        System.out.println("\nSetelah zoomOut():");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        P2.zoom(200); // Membesar 2x lipat
        System.out.println("\nSetelah zoom(200):");
        System.out.println("Sisi: " + P2.getSisi());
        System.out.println("Luas: " + P2.getLuas());

        // Demo objek Lingkaran
        System.out.println("\nDemonstrasi IResize dengan Lingkaran L2:");
        System.out.println("Jari-jari awal: " + L2.getJariJari());
        System.out.println("Luas awal: " + L2.getLuas());

        L2.zoomIn(); // Membesar 10%
        System.out.println("\nSetelah zoomIn():");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        L2.zoomOut(); // Mengecil 10%
        System.out.println("\nSetelah zoomOut():");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        L2.zoom(150); // Membesar 1.5x lipat
        System.out.println("\nSetelah zoom(150):");
        System.out.println("Jari-jari: " + L2.getJariJari());
        System.out.println("Luas: " + L2.getLuas());

        // Demo menggunakan referensi tipe IResize
        System.out.println("\nDemon dengan Referensi IResize:");

        IResize resizableP = P2;
        IResize resizableL = L2;

        resizableP.zoom(50); // Mengecil menjadi 50%
        System.out.println("Setelah resizableP.zoom(50):");
        System.out.println("Sisi P2: " + P2.getSisi());

        resizableL.zoom(50); // Mengecil menjadi 50%
        System.out.println("Setelah resizableL.zoom(50):");
        System.out.println("Jari-jari L2: " + L2.getJariJari());

    }
}
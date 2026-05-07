/* Nama File    : MainTeman.java
   Deskripsi    : Program utama (Application) untuk menguji seluruh fungsi/operator 
                  yang ada pada kelas Teman.
   Pembuat      : Quinta Aurabiansya/24060124120016
   Tanggal      : 07 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args) {
        Teman koleksiTeman = new Teman();

        // Demo addNama
        koleksiTeman.addNama("Andi");
        koleksiTeman.addNama("Budi");
        koleksiTeman.addNama("Citra");
        koleksiTeman.addNama("Andi"); //nama duplikat untuk tes countNama

        koleksiTeman.showTeman();
        System.out.println("-------------------------");

        //Demo getNama & getNbelm
        System.out.println("Banyak elemen: " + koleksiTeman.getNbelm());
        System.out.println("Nama pada indeks 1: " + koleksiTeman.getNama(1));

        //Demo isMember & countNama
        System.out.println("Apakah 'Citra' member? " + koleksiTeman.isMember("Citra"));
        System.out.println("Jumlah nama 'Andi': " + koleksiTeman.countNama("Andi"));

        //Demo gantiNama
        System.out.println("\nMengganti 'Budi' menjadi 'Budi Santoso'...");
        koleksiTeman.gantiNama("Budi", "Budi Santoso");

        //Demo delNama
        System.out.println("Menghapus 'Citra'...");
        koleksiTeman.delNama("Citra");

        System.out.println("\n--- Daftar Setelah Perubahan ---");
        koleksiTeman.showTeman();
    }
}
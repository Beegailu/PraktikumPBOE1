/* Nama File    : Asersi1.java
   Deskripsi    : Program untuk menunjukkan Asersi1 
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0)
            System.out.println("x bilangan positif");
        else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
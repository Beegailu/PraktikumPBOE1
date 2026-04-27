/* Nama File    : Asersi2.java
   Deskripsi    : Program untuk demo asersi2, yang akan menolak input
                  jari-jari lingkaran yang bernilai nol
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
 */

//class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " 
                + kelilingLingkaran);
    }
}

/* PERTANYAAN :secara konsep, ada yang kurang tepat pada program Asersi2 di atas.

   JAWABAN:
   Ya, ada yang kurang tepat pada program tersebut, yaitu asersi kurang tepat untuk validasi input user.
   Karena assertion dapat dinonaktifkan saat program dijalankan, maka pengecekan tersebut bisa tidak berjalan.
   Jadi yang benar validasi radius seharusnya pakai:
   if (jariJari <= 0) {
   System.out.println("Jari-jari tidak boleh nol atau negatif");} //bukan assert
   Asersi seharusnya digunakan untuk menguji kondisi internal program saat debugging, bukan untuk validasi input pengguna.
 */
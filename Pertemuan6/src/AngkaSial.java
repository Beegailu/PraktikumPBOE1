/* Nama File    : AngkaSial.java
   Deskripsi    : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {

        if (angka == 13) {
            throw new AngkaSialException();
        }

        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {

        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {

            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*PERTANYAAN 
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  

JAWABAN:
Pada baris 12 pada AngkaSial.java TIDAK dieksekusi, karena pada saat angka 13 dimasukkan:
throw new AngkaSialException();
//Program langsung melempar exception dan keluar dari method, 
// sehingga baris setelah throw tidak dijalankan.
===========================================================================================
Pada baris 21 pada AngkaSial.java YA dieksekusi, Karena setelah exception dilempar, 
program masuk ke blok:
catch (AngkaSialException ase)
//Sehingga baris pada blok catch akan dijalankan.
 */
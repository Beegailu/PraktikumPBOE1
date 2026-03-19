/* Nama File : Main.java
   Deskripsi : Kelas Main merupakan kelas utama yang digunakan untuk menjalankan program
               dan menguji implementasi hierarchy class Pegawai
   Pembuat   : Quinta Aurabiansyah/24060124120016
   Tanggal   : 19/03/2026
 */

import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
                System.out.println("======================================================");
                System.out.println("     INFORMASI KEPEGAWAIAN PERGURUAN TINGGI");
                System.out.println("======================================================");
                System.out.println();

                // Membuat objek DosenTetap
                DosenTetap dosenTetap = new DosenTetap(
                                "9545647548", // NIP
                                "Andi", // Nama
                                LocalDate.of(1990, 5, 5), // Tanggal Lahir
                                LocalDate.of(2015, 1, 1), // TMT 
                                5000000, // Gaji Pokok
                                "Fakultas Sains dan Matematika", // Fakultas
                                "78647324" // NIDN
                );

                // Membuat objek DosenTamu
                DosenTamu dosenTamu = new DosenTamu(
                                "957685432", // NIP
                                "Bian", // Nama
                                LocalDate.of(1995, 12, 9), // Tanggal Lahir
                                LocalDate.of(2020, 3, 1), // TMT
                                4500000, // Gaji Pokok
                                "Fakultas Sains dan Matematika", // Fakultas
                                "0789762", // NIDK
                                LocalDate.of(2026, 12, 31) // Tanggal Berakhir Kontrak
                );

                // Membuat objek Tendik
                Tendik tendik = new Tendik(
                                "T.0965436", // NIP
                                "Wenno", // Nama
                                LocalDate.of(1985, 1, 12), // Tanggal Lahir
                                LocalDate.of(2017, 6, 8), // TMT
                                3500000, // Gaji Pokok
                                "Akademik" // Bidang
                );


                // Menampilkan informasi untuk setiap pegawai
                System.out.println("\n===== INFORMASI DOSEN TETAP =====");
                dosenTetap.printInfo();

                System.out.println("\n===== INFORMASI DOSEN TAMU =====");
                dosenTamu.printInfo();

                System.out.println("\n===== INFORMASI TENAGA KEPENDIDIKAN =====");
                tendik.printInfo();

                System.out.println("\n======================================================");
                System.out.println("              PROGRAM SELESAI");
                System.out.println("======================================================");
        }
}
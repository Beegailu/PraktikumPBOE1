/* Nama File    : Coersion.java
   Deskripsi    : Menampilkan program demonstrasi Polimorfisme Ad Hoc Coersion
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
*/
 
public class Coersion {
    public static void main(String[] args) {
 
        System.out.println("=== Coersion Dasar ===");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;   
        double nilaiDouble = (double) nilaiInt; 
 
        System.out.println("Sebagai integer : " + nilaiInt);
        System.out.println("Sebagai karakter: " + nilaiChar);
        System.out.println("Sebagai real    : " + nilaiDouble);
 

        System.out.println("\n=== Real ke Integer (variabel berbeda) ===");
        double realValue = 65.9;
        int kembaliInt = (int) realValue;   
        System.out.println("Nilai real    : " + realValue);
        System.out.println("Kembali ke int: " + kembaliInt);
 
    
        System.out.println("\n=== String Konkatenasi vs Penjumlahan Integer ===");
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // penjumlahan
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi)  : " + S);
        System.out.println("Z (penjumlahan)  : " + Z);
 

        System.out.println("\n=== String Konkatenasi vs Penjumlahan Double ===");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // penjumlahan
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi)  : " + R);
        System.out.println("D (penjumlahan)  : " + D);
 

        System.out.println("\n=== Integer A dari konversi S ===");
        Integer A = Integer.parseInt(S);
        System.out.println("S = \"" + S + "\"");
        System.out.println("A (Integer dari S): " + A);
 

        System.out.println("\n=== String T dari konversi A ===");
        String T = A.toString();
        System.out.println("A = " + A);
        System.out.println("T (String dari A) : \"" + T + "\"");
    }
}
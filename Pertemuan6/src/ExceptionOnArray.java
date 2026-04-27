/* Nama File    : ExceptionOnArray.java
   Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
   Pembuat      : Quinta Aurabiansyah / 24060124120016
   Tanggal      : 27 April 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}


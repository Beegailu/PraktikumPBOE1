/*Nama File : Titik.java
 *Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Quinta Aurabiansyah/24060124120016
 * Tanggal : 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3,4); // mengggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser

        //Object Reference
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(3,5);
        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T3.getCounterTitik());

         // uji getKuadran 
        Titik t1 = new Titik(10, 15); // Kuadran I
        System.out.println("Kuadran t1: " + t1.getKuadran()); 

        Titik t2 = new Titik(-10, 15); // Kuadran II
        System.out.println("Kuadran t2: " + t2.getKuadran()); 

        Titik t3 = new Titik(-10, -15); // Kuadran III
        System.out.println("Kuadran t3: " + t3.getKuadran()); 

        Titik t4 = new Titik(10, -15); // Kuadran IV
        System.out.println("Kuadran t4: " + t4.getKuadran()); 

        // uji getjarakPusat
        System.out.println("Jarak t1 ke pusat: " + t1.getjarakPusat());

        // uji getJarak antara t1 dan t2
        System.out.println("Jarak antara t1 dan t2: " + t1.getJarak(t2));

        // uji refleksiX
        t1.refleksiX();
        System.out.print("t1 setelah refleksiX: ");
        t1.printTitik();

        //uji refleksiY
        t1.refleksiY();
        System.out.print("t1 setelah refleksiY: ");
        t1.printTitik();

        //uji getRefleksiX
        Titik t1RefleksiX = t1.getRefleksiX();
        System.out.print("getRefleksiX dari t1: ");
        t1RefleksiX.printTitik();

        //uji getRefleksiY
        Titik t1RefleksiY = t1.getRefleksiY();
        System.out.print("getRefleksiY dari t1: ");
        t1RefleksiY.printTitik();
    }    
}

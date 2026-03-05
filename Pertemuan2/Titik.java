/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Quinta Aurabiansyah/24060124120016
 * Tanggal : 27 Februari 2026
 */

 public class Titik {
    // Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

 // Konstruktor
 //konsturktor dengan parameter
 public Titik(double absis, double ordinat){
   this.absis = absis;
   this.ordinat = ordinat;
   counterTitik++;
 }
 
 //konstruktor default
 public Titik() {
   this(0,0);
 }

 /******Method******/
 //mengembalikan nilai counterTItik
 static int getCounterTitik(){
   return counterTitik;
 }

 void printCounterTitik(){
   System.out.println(this.counterTitik);
 }

 //mengembalikan nilai absis
 double getAbsis(){
    return absis;
 }

 //mengembalikan nilai ordinat
 double getOrdinat(){
    return ordinat;
 }

 //mengeset absis titik dengan nilai baru x
 void setAbsis(double x){
    absis = x;
 }

 //mengeset ordinat titik dengan nilai baru y
 void setOrdinat(double y){
    ordinat = y;
 }

 //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
 void geser(double x, double y){
    absis = absis + x;
    ordinat = ordinat + y;
 }

 // mendapatkan kuadran titik
  public int getKuadran() {
    if (absis > 0 && ordinat > 0) {
      return 1;
    } else if (absis < 0 && ordinat > 0) {
      return 2;
    } else if (absis < 0 && ordinat < 0) {
      return 3;
    } else if (absis > 0 && ordinat < 0) {
      return 4;
    } else {
      return 0; // titik berada di pusat koordinat
    }
  }

  // mendapatkan jarak titik ke pusat koordinat
  public double getjarakPusat() {
    return Math.sqrt(absis * absis + ordinat * ordinat);
  }

  // mendapatkan jarak titik ke titik T
  public double getJarak(Titik T) {
    return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));
  }

  // refleksi terhadap sumbu x
  public void refleksiX() {
    ordinat = -ordinat;
  }

  // refleksi terhadap sumbu y
  public void refleksiY() {
    absis = -absis;
  }

  // mengembalikan titik hasil refleksi terhadap sumbu x
  public Titik getRefleksiX() {
    return new Titik(absis, -ordinat);
  }

  // mengembalikan titik hasil refleksi terhadap sumbu y
  public Titik getRefleksiY() {
    return new Titik(-absis, ordinat);
  }
 //mencetak koordinat titik
 void printTitik() {
    System.out.println("Titik(" + absis + "," + ordinat + ")");
 }

 
}
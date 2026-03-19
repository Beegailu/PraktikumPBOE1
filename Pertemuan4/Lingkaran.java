/* Nama File : Persegi.java
  Deskripsi : berisi atribut dan method dalam class Lingkaran
  Creator   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 12 Maret 2026
*/

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

     @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}

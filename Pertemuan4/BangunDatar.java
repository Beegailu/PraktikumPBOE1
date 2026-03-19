/* Nama File : BangunDatar.java
  Deskripsi : berisi atribut dan method dalam class Bangun Datar
  Creator   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 12 Maret 2026
*/


public class BangunDatar {
    protected  int jmlSisi;
    protected  String warna;
    protected  String border;
    protected  static int counterBangunDatar = 0;


    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }


    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);

    }

}
public class Kendaraan {
  /************** ATRIBUT **************/
  private String noPlat;
  private String jenis;

  /************** METHOD **************/
  // Konstruktor tanpa parameter
  public Kendaraan() {
    this.noPlat = "";
    this.jenis = "";
  }

  // Konstruktor dengan parameter noPlat dan jenis
  public Kendaraan(String noPlat, String jenis) {
    this.noPlat = noPlat;
    this.jenis = jenis;
  }

  // Selektor (getter)
  public String getNoPlat() {
    return noPlat;
  }

  public String getJenis() {
    return jenis;
  }

  // Mutator (setter)
  public void setNoPlat(String noPlat) {
    this.noPlat = noPlat;
  }

  public void setJenis(String jenis) {
    this.jenis = jenis;
  }
}
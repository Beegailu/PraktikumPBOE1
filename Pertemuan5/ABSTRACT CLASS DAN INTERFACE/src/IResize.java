/* Nama File : IResize.java
  Deskripsi : Interface yang mendefinisikan kemampuan resize suatu objek
  Pembuat   : Quinta Aurabiansyah/24060124120016
  Tanggal   : 25 April 2026
*/

public interface IResize {
  // Method untuk memperbesar ukuran objek menjadi 10% lebih besar
  void zoomIn();

  // Method untuk memperkecil ukuran objek menjadi 10% lebih kecil
  void zoomOut();

  // Method untuk mengubah ukuran objek sesuai dengan persentase yang diberikan
  void zoom(double percent);
}

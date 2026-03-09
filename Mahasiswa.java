public class Mahasiswa {
  private String nim;
  private String nama;
  private String jurusan;
  private double ipk;

  public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.jurusan = jurusan;
    this.ipk = ipk;
  }

  public String tampilkanInfo() {
    return (
      "Nama: " + nama + "\n" +
      "NIM: " + nim + "\n" +
      "Jurusan: " + jurusan + "\n" +
      "IPK: " + ipk + "\n"
    );
  }
}

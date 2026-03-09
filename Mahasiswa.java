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

  public void tampilkanInfo() {
    System.out.println("Nama    : " + nama);
    System.out.println("NIM     : " + nim);
    System.out.println("Jurusan : " + jurusan);
    System.out.printf ("IPK     : %.2f%n", ipk);
    System.out.println();
  }
}

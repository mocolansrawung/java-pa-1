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

  public String getNim() {
    return nim;
  }

  public double getIpk() {
    return ipk;
  }

  public void setIpk(double ipk) {
    if (ipk >= 0.0 && ipk <= 4.0) {
      this.ipk = ipk;
    } else {
      System.out.println("IPK harus antara 0.0 dan 4.0");
    }
  }

  public void tampilkanInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Jurusan: " + jurusan);
    System.out.printf ("IPK: %.2f%n", ipk);
  }

  public void cekKelulusan() {
    if (ipk >= 3.0) {
      System.out.println("Status: Lulus");
    } else {
      System.out.println("Status: Belum Lulus");
    }
  }

  public void updateIpk(double ipkBaru) {
    setIpk(ipkBaru);
  }
}

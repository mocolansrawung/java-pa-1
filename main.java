import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Mahasiswa[] daftarMahasiswa = new Mahasiswa[5];

    daftarMahasiswa[0] = new Mahasiswa("123456", "Robi Darwis", "Ilmu Komputer", 3.8);
    daftarMahasiswa[1] = new Mahasiswa("654321", "Robi Syianturi", "Pendidikan Olahraga", 3.5);
    daftarMahasiswa[2] = new Mahasiswa("789012", "Fahril", "Arsitektur", 3.9); 
    daftarMahasiswa[3] = new Mahasiswa("210987", "dr. Tirta", "Kedokteran", 3.7);
    daftarMahasiswa[4] = new Mahasiswa("345678", "Rizky", "Teknik Sipil", 3.6);

    // Soal 1: Menampilkan informasi semua mahasiswa yang ada
    System.out.println("Soal 1: Menampilkan informasi semua mahasiswa yang ada\n");
    System.out.println("=== Data Mahasiswa ===\n");
    for (Mahasiswa mahasiswa : daftarMahasiswa) {
      mahasiswa.tampilkanInfo();
      System.out.println();
    }

    // Soal 2: Enkapsulasi dan Update IPK
    // System.out.println("Soal 2: Enkapsulasi dan Update IPK\n");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
    String nimInput = scanner.nextLine().trim();

    Mahasiswa targetMahasiswa = null;
    for (Mahasiswa mahasiswa : daftarMahasiswa) {
      if (mahasiswa.getNim().equals(nimInput)) {
        targetMahasiswa = mahasiswa;
        break;
      }
    }

    if (targetMahasiswa != null) {
      System.out.print("Masukkan IPK baru: ");
      double ipkBaru = scanner.nextDouble();
      scanner.nextLine();

      targetMahasiswa.updateIpk(ipkBaru);
      System.out.println("Data berhasil diperbarui!\n");

      System.out.println("=== Data Mahasiswa ===\n");
      targetMahasiswa.tampilkanInfo();
      targetMahasiswa.cekKelulusan();
    } else {
      System.out.println("NIM tidak ditemukan dalam sistem.\n");
    }
    System.out.println();

    // Soal 3: Menampilkan predikat akademik seluruh mahasiswa
    System.out.println("Soal 3: Menampilkan predikat akademik seluruh mahasiswa\n");
    System.out.println("=== Data Mahasiswa ===\n");
    for (Mahasiswa mahasiswa : daftarMahasiswa) {
      mahasiswa.tampilkanInfoLengkap();
    }

    scanner.close();
  }
}

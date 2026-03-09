public class main {
  public static void main(String[] args) {
    Mahasiswa[] daftarMahasiswa = new Mahasiswa[5];

    daftarMahasiswa[0] = new Mahasiswa("123456", "Robi Darwis", "Ilmu Komputer", 3.8);
    daftarMahasiswa[1] = new Mahasiswa("654321", "Robi Syianturi", "Pendidikan Olahraga", 3.5);
    daftarMahasiswa[2] = new Mahasiswa("789012", "Fahril", "Arsitektur", 3.9); 
    daftarMahasiswa[3] = new Mahasiswa("210987", "dr. Tirta", "Kedokteran", 3.7);
    daftarMahasiswa[4] = new Mahasiswa("345678", "Rizky", "Teknik Sipil", 3.6);

    // Soal 1: Menampilkan informasi semua mahasiswa yang ada
    System.out.println("=== Data Mahasiswa ===\n");
    for (Mahasiswa mahasiswa : daftarMahasiswa) {
      mahasiswa.tampilkanInfo();
    }
  }
}

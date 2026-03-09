public class main {
  public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa("123456", "Robi Darwis", "Ilmu Komputer", 3.8);
    Mahasiswa mahasiswa2 = new Mahasiswa("654321", "Robi Syianturi", "Pendidikan Olahraga", 3.5);
    Mahasiswa mahasiswa3 = new Mahasiswa("789012", "Fahril", "Arsitektur", 3.9); 
    Mahasiswa mahasiswa4 = new Mahasiswa("210987", "dr. Tirta", "Kedokteran", 3.7);

    System.out.println("=== Data Mahasiswa ===\n");
    System.out.println(mahasiswa1.tampilkanInfo());
    System.out.println(mahasiswa2.tampilkanInfo());
    System.out.println(mahasiswa3.tampilkanInfo());
    System.out.println(mahasiswa4.tampilkanInfo());
  }
}

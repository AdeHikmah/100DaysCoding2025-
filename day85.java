public class day85 {
  public static void main(String[] args) {
    int[] nilaiSiswa = {45, 70, 95, 30, 88, 65};
    int nilaiTertinggi = nilaiSiswa[0];

    System.out.println("--- Daftar Nilai Siswa ---");
    for (int i = 0; i < nilaiSiswa.length; i++) {
      System.out.print(nilaiSiswa[i] + " ");
      if (nilaiSiswa[i] > nilaiTertinggi) {
        nilaiTertinggi = nilaiSiswa[i];
      }
    }
    System.out.println("\n--------------------------");
    System.out.println("Nilai Tertinggi di Kelas: " + nilaiTertinggi);
  }
}

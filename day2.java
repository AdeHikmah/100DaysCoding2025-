public class day2 {
    public static void main(String[] args) {
        //Penggunaan System.out.println()
        System.out.println("=== Soal 1 ===");
        System.out.println("Saya akan bertahan selama 100 Hari Ngoding, dan akan menjadi anggota resmi ISC");
        System.out.println("");//Memberi jarak garis baru
        
        //Penggunaan System.out.print()
        System.out.println("=== Soal 2 ===");
        System.out.print("Selamat telah");
        System.out.print(" menjadi anggota ISC");
        System.out.println(""); //Memberi jarak garis baru
        
        //Penggunaan System.out.printf()
        System.out.println("");//Memberi jarak garis baru
        System.out.println("=== Soal 3 ===");
        
        //Data Diri
        String nama = "Hikmah";
        String nim = "D0224027";
        char kelas = 'A';
        int umur = 18;
        double tinggiBadan = 154.5;
        
        //Mencetak tabel menggunakan printf, pakai |
        System.out.printf("| %-5s : %-15s |%n", "Nama", nama);
        System.out.printf("| %-5s : %-15s |%n", "NIM", nim);
        System.out.printf("| %-5s : %-15c |%n", "Kelas", kelas);
        System.out.printf("| %-5s : %-15d |%n", "Umur", umur);
        System.out.printf("| %-5s : %-15.1f |%n", "TB", tinggiBadan);
        
    }
  
}

import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Program Input Biodata ---");
        
        System.out.print("Masukkan Nama Lengkap Anda: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM Anda: ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan Umur Anda: ");
        int umur = sc.nextInt();
        
        System.out.print("Masukkan Kelas (A/B/C/D): ");
        char kelas = sc.next().charAt(0);
        
        System.out.print("Masukkan IPK Anda: ");
        double ipk = sc.nextDouble();
        
        System.out.println("\n==================== ");
        System.out.println("   BIODATA MAHASISWA   ");
        System.out.println("\n==================== ");
        System.out.printf("%-7s: %s\n", "NAMA", nama);
        System.out.printf("%-7s: %s\n", "NIM", nim);
        System.out.printf("%-7s: %d tahun\n", "Umur", umur);
        System.out.printf("%-7s: %c\n", "KELAS", kelas);
        System.out.printf("%-7s: %.2f\n", "IPK", ipk);
    }
}

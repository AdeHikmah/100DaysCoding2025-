import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEM VERIFIKASI AGEN ---");

        System.out.print("Masukkan level agen (1 - 10): ");
        int level = sc.nextInt();

        System.out.print("Masukkan jumlah misi sukses: ");
        int misi = sc.nextInt();

        System.out.print("Apakah identitas Anda diketahui oleh musuh? (true/false): ");
        boolean terdeteksi = sc.nextBoolean();

        // logika
        boolean levelCukup = level >= 7;
        boolean pengalaman = misi >= 5;
        boolean aman = !terdeteksi;
        boolean lolos = (levelCukup && pengalaman && aman) || (level == 10);

        // hasil
        System.out.println("\n--- HASIL VERIFIKASI ---");
        System.out.println("Level agen? " + levelCukup);
        System.out.println("Pengalaman misi yang sudah dilakukan? " + pengalaman);
        System.out.println("Aman dari musuh? " + aman);
        System.out.println("Apakah agen diterima sistem? " + lolos);
    }
}

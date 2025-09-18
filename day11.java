import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== FORM PENDAFTARAN KRU BAJAK LAUT TOPI JERAMI ===");
        
        // String
        System.out.print("Nama Bajak Laut : ");
        String nama = sc.nextLine();
        
        // byte
        System.out.print("Umur (tahun) : ");
        byte umur = sc.nextByte();
        
        // short
        System.out.print("Tahun Lahir (Era One Piece) : ");
        short lahir = sc.nextShort();
        
        // int
        System.out.print("Nomor Eternal Pose (unik, panjang) : ");
        int eternalPose = sc.nextInt();
        
        // long
        System.out.print("Bounty Awal (jutaan berry, contoh : 10000000): ");
        long bountyAwal = sc.nextLong();
        
        // float
        System.out.print("Tinggi Badan (cm) : ");
        float tinggiBadan = sc.nextFloat();
        
        // double
        System.out.print("Berat Badan (kg) : ");
        double beratBadan = sc.nextDouble();
        
        // boolean
        System.out.print("Apakah pengguna buah iblis? (true/false): ");
        boolean buahIblis = sc.nextBoolean();
        
        sc.nextLine(); // buang enter yang tersisa
        
        // char (input minimal 3 huruf)
        System.out.print("Kode Rahasia Kru (minimal 3 huruf): ");
        String kode = sc.nextLine();
        char kodeKetiga = kode.charAt(2);
        
        // Output
        System.out.println("\n=== DATA KRU BARU ===");
        System.out.println("Nama Bajak Laut : " + nama);
        System.out.println("Umur (tahun) : " + umur);
        System.out.println("Tahun Lahir (Era One Piece) : " + lahir);
        System.out.println("Nomor Eternal Pose : " + eternalPose);
        System.out.println("Bounty Awal (jutaan berry, contoh : 10000000): " + bountyAwal);
        System.out.println("Tinggi Badan (cm) : " + tinggiBadan);
        System.out.println("Berat Badan (kg) : " + beratBadan);
        System.out.println("Apakah pengguna buah iblis? " + buahIblis);
        System.out.println("Kode Rahasia Kru (huruf ke-3): " + kodeKetiga);
        System.out.println("\nSelamat " + nama + "! Kamu resmi bergabung dengan Bajak Laut Topi Jerami!");
        
        sc.close();
    }
}

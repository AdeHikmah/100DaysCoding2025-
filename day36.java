import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- SISTEM KEAMANAN RUANG SERVER UTAMA ---");

        System.out.print("Apakah Anda memiliki kartu akses? (true/false): ");
        boolean kartuAkses = sc.nextBoolean();

        System.out.print("Apakah Anda sedang dalam jadwal piket? (true/false): ");
        boolean jadwalPiket = sc.nextBoolean();

        System.out.print("Masukkan kode PIN: ");
        int pin = sc.nextInt();

        System.out.println("------------------------------------------------------------");

        //nested if atau if bersarang
        if (kartuAkses) {
            System.out.println("Kartu akses valid. Lanjut ke pintu ruang IT...");
            if (jadwalPiket) {
                System.out.println("Anda terdaftar dalam jadwal piket hari ini. Lanjut ke pintu ruang server...");
                if (pin == 1004) {
                    System.out.println("PIN benar! Akses diterima, selamat datang di ruang server utama.");
                } else {
                    System.out.println("PIN salah! Akses ditolak di pintu ruang server.");
                }
            } else {
                System.out.println("Anda tidak dalam jadwal piket hari ini. Akses ditolak di pintu ruang IT");
            }
        } else {
            System.out.println("Kartu akses tidak valid! Akses ditolak di pintu gerbang utama");
        }
    }
}

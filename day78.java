import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== DAFTAR AKUN BARU ===");
        System.out.print("Masukkan Username: ");
        String username = input.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("ERROR: Username tidak boleh kosong.");
            return;
        }

        if (username.length() > 12) {
            System.out.println("ERROR: Username terlalu panjang (maks 12).");
            return;
        }

        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        System.out.print("Ulangi Password: ");
        String confirmPassword = input.nextLine();

        if (password.length() < 8) {
            System.out.println("ERROR: Password minimal 8 karakter.");
            return;
        }

        if (password.toLowerCase().contains("admin")) {
            System.out.println("ERROR: Password tidak boleh mengandung kata 'admin'.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("ERROR: Password tidak cocok.");
            return;
        }

        char hurufPertama = password.charAt(0);

        if (hurufPertama >= 'A' && hurufPertama <= 'Z') {
            System.out.println("\nSUKSES: Pendaftaran Berhasil!");
            System.out.println("Username '" + username.toLowerCase() + "' telah aktif.");
        } else {
            System.out.println("ERROR: Huruf pertama password harus Kapital.");
        }
    }
}

import java.util.Scanner;

public class day39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- MENU MINUMAN ---");
        System.out.println("1. Es Teh (Rp 5000)");
        System.out.println("2. Es Jeruk (Rp 7000)");
        System.out.println("3. Kopi Susu (Rp 8000)");

        System.out.print("\nMasukkan angka pilihan (1, 2, atau 3) : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memesan Es Teh dengan harga Rp 5000.");
        } else if (pilihan == 2) {
            System.out.println("Anda memesan Es Jeruk dengan harga Rp 7000.");
        } else if (pilihan == 3) {
            System.out.println("Anda memesan Kopi Susu dengan harga Rp 8000.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}

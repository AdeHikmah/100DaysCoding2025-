import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        int angkaRahasia = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tebak angka rahasia (1-10): ");
        int tebakan = scanner.nextInt();

        while (tebakan != angkaRahasia) {
            System.out.print("Tebak angka rahasia (1-10): ");
            tebakan = scanner.nextInt();
        }

        System.out.println("Selamat, tebakan Anda benar!");
    }
}

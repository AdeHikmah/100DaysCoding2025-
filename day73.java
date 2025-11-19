import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        int total = 0;

        System.out.println("Masukkan angka (angka negatif = berhenti): ");

        while (true) {
            angka = sc.nextInt();

            if (angka < 0) {   
                break;
            }

            total += angka;   
        }

        System.out.println("Total penjumlahan: " + total);
    }
}

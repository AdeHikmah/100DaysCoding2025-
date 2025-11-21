import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = sc.nextLine();

        System.out.println("Panjang karakter: " + nama.length());
        System.out.println("Huruf kapital : " + nama.toUpperCase());
        System.out.println("Huruf kecil   : " + nama.toLowerCase());
    }
}

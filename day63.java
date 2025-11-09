import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas angka (N) : ");
        int N = sc.nextInt();
        int total = 1;
        System.out.print("Total perkalian dari 1 sampai " + N + " adalah : ");
        for (int i = 1; i <= N; i++) {
            total *= i;
        }
        System.out.println(total);
    }
}

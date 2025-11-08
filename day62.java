import java.util.Scanner;
public class day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas angka (N) : ");
        int N = sc.nextInt();
        int total = 0;
        for (int i = 0; i <= N; i++) {
            total += i;
        }
        System.out.println(total);
    }
}

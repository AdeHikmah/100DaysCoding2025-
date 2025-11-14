import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi (n) : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {          // baris
            for (int j = 0; j < n; j++) {      // kolom
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

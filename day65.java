mport java.util.Scanner;

public class day65{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }

        System.out.println(" = " + hasil);
    }
}

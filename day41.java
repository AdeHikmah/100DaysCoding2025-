import java.util.Scanner;

public class forI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {       // baris
            for (int j = 1; j <= i; j++) {        // kolom
                System.out.print("*");
            }
            System.out.println(); // pindah baris
        }
    }
}

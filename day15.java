import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Masukkan angka pertama (String): ");
        String str1 = sc.nextLine();

        System.out.print("Masukkan angka kedua (String): ");
        String str2 = sc.nextLine();

        // sebelum parse
        System.out.println("\n=== Sebelum Parse (String) ===");
        System.out.println("str1 + str2 = " + (str1 + str2));

        // setelah parse
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("\n=== Setelah Parse (Integer) ===");
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));

        sc.close(); // <--- tutup scanner di akhir
    }
}

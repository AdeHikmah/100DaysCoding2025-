import java.util.Scanner;

public class day24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai jari-jari
        System.out.print("Masukkan nilai r : ");
        int r = input.nextInt();

        // Mendefinisikan konstanta phi
        final double phi = 3.14;

        // Menghitung luas lingkaran
        double luaslingkaran = phi * (r * r);

        // Menampilkan hasil
        System.out.printf("Luas lingkaran dengan jari-jari %d adalah %.2f\n", r, luaslingkaran);
        
    }
}

import java.util.Scanner;

public class day34 {

public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    System.out.println("--- UJIAN MASUK U.A HIGH SCHOOL ---");

    System.out.print("Selamat datang calon pahlawan muda");

    System.out.print("Jawablah dengan jujur agar hasilmu akurat\n");

    System.out.print("Masukkan Power Level Quirk Anda (0-100): ");
    int power = sc.nextInt();

    System.out.print("Masukkan Power Speed Anda (0-100): ");
    int speed = sc.nextInt();

    System.out.print("Apakah Quirk Anda termasuk berbahaya atau tak terkendali? (true/false): ");
    boolean quirk = sc.nextBoolean();

    //rata-rata performa
    double skorAkhir = (power + speed) / 2.0;

    //syarat lulus
    boolean lulus = (skorAkhir >= 72 && !quirk) || (power >=93);

    System.out.println("\n--- HASIL PENILAIAN AIZAWA SENSEI ---");
    System.out.println("Level Power Quirk : " + power);
    System.out.println("Kecepatan : " + speed);
    System.out.println("Status Quirk : " + quirk);
    System.out.println("Skor Akhir : " + skorAkhir);
    System.out.println("---------------------------------------");
    System.out.println("Status kelulusan : " + lulus);
}
}  

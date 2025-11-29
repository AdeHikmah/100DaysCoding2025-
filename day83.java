import java.util.Scanner;

public class day83 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] pengeluaran = new int[7];
    int totalPengeluaran = 0;

    for (int i = 0; i < pengeluaran.length; i++) {
      System.out.print("Masukkan pengeluaran hari ke-" + (i + 1) + ": ");
      pengeluaran[i] = scanner.nextInt();
    }

    System.out.println("--- Rincian Pengeluaran ---");
    for (int i = 0; i < pengeluaran.length; i++) {
      System.out.println("Hari ke-" + (i + 1) + ": Rp " + pengeluaran[i]);
      totalPengeluaran += pengeluaran[i];
    }
    System.out.println("---------------------------");
    System.out.println("Total Pengeluaran Seminggu: Rp " + totalPengeluaran);
  }
}

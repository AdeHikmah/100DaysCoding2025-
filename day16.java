import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input jumlah bus
        System.out.print("Masukkan jumlah bus yang disewa : ");
        int jumlahBus = sc.nextInt();
        
        //Data tetap
        final int KAPASITAS_BUS = 50; //kursi
        final int BIAYA_BUS = 7500000; //rupiah
        
        //hitung total kapasitas penumpang
        int totalKapasitas = jumlahBus * KAPASITAS_BUS;
        
        //hitung total biaya sewa semua bus
        int totalBiaya = jumlahBus * BIAYA_BUS;
        
        //hitung biaya per kursi/penumpang
        double biayaPerKursi = (double) totalBiaya / totalKapasitas;
        
        //OUTPUT
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jumlah Bus yang Disewa : " + jumlahBus);
        System.out.println("Total Kapasitas Penumpang : " + totalKapasitas + " kursi");
        System.out.println("Total Biaya Sewa : Rp" + totalBiaya);
        System.out.println("Biaya per Kursi/Penumpang : Rp" + biayaPerKursi );
        
    }
  
}

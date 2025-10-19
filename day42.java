import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Hitung Gaji Bersih ---");
        System.out.print("Masukkan Gaji Kotor Bulanan: ");
        double gajiKotor = input.nextDouble();

        // Hitung Biaya Jabatan (5% dari gaji kotor, maksimal 500.000)
        double biayaJabatan = gajiKotor * 0.05;
        if (biayaJabatan > 500000) {
            biayaJabatan = 500000;
        }

        // Penghasilan neto bulanan dan tahunan
        double netoBulanan = gajiKotor - biayaJabatan;
        double netoTahunan = netoBulanan * 12;

        // PTKP untuk status TK/0
        double ptkp = 54000000;

        // Hitung PKP (Penghasilan Kena Pajak)
        double pkp = netoTahunan - ptkp;
        if (pkp < 0) {
            pkp = 0;
        }

        // Hitung PPh 21 Tahunan 
        double pphTahunan;
        if (pkp <= 60000000) {
            pphTahunan = pkp * 0.05;
        } else if (pkp <= 250000000) {
            pphTahunan = (60000000 * 0.05) + ((pkp - 60000000) * 0.15);
        } else if (pkp <= 500000000) {
            pphTahunan = (60000000 * 0.05) + (190000000 * 0.15) + ((pkp - 250000000) * 0.25);
        } else if (pkp <= 5000000000L) {
            pphTahunan = (60000000 * 0.05) + (190000000 * 0.15)
                       + (250000000 * 0.25) + ((pkp - 500000000) * 0.30);
        } else {
            pphTahunan = (60000000 * 0.05) + (190000000 * 0.15)
                       + (250000000 * 0.25) + (4500000000L * 0.30)
                       + ((pkp - 5000000000L) * 0.35);
        }

        // Pajak bulanan & gaji bersih
        double pphBulanan = pphTahunan / 12;
        double gajiBersih = netoBulanan - pphBulanan;

        // Cetak hasil
        System.out.println("\n--- Rincian Perhitungan ---");
        System.out.printf("Gaji Kotor Bulanan             : Rp %, .2f%n", gajiKotor);
        System.out.printf("Biaya Jabatan (5%%, maks 500rb): Rp %, .2f%n", biayaJabatan);
        System.out.printf("Penghasilan Neto Bulanan       : Rp %, .2f%n", netoBulanan);
        System.out.printf("Penghasilan Neto Tahunan       : Rp %, .2f%n", netoTahunan);
        System.out.printf("PTKP (TK/0) Tahunan            : Rp %, .2f%n", ptkp);
        System.out.printf("Penghasilan Kena Pajak (PKP)   : Rp %, .2f%n", pkp);
        System.out.printf("PPh 21 Tahunan                 : Rp %, .2f%n", pphTahunan);
        System.out.printf("PPh 21 Bulanan                 : Rp %, .2f%n", pphBulanan);
        System.out.println("--------------------------------------------------");
        System.out.printf("Gaji Bersih Bulanan            : Rp %, .2f%n", gajiBersih);
    }
}

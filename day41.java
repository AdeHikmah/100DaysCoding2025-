import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Program Harga Diskon ---");
        System.out.print("Masukkan jumlah barang : ");
        int barang = sc.nextInt();
        System.out.print("Masukkan harga per barang : ");
        double harga = sc.nextDouble();
        System.out.print("Apakah Anda member? (true/false) : ");
        String status = sc.next();
        sc.nextLine();
        double total = barang * harga;
        boolean anggota = Boolean.parseBoolean(status);
        boolean berhak = (total >= 250000) && (anggota == true);
        double totalAkhir = 0;
        double jumlahDiskon;
        
        if (berhak) {
            jumlahDiskon = total * 0.10;
        }else{
            jumlahDiskon = 0;
        }
        totalAkhir = total - jumlahDiskon;
        System.out.println("\n--- Ringkasan Pembelian ---");
        System.out.printf("%-15s : Rp %.2f %n", "Total Pembelian ", total);
        System.out.printf("%-15s : %b %n", "Berhak Diskon 10% ", status);
        System.out.printf("%-15s : Rp %.2f %n", "Jumlah Diskon", jumlahDiskon );
        System.out.printf("%-15s : Rp %.2f %n", "Total Bayar", totalAkhir );
    }
}

import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int S = sc.nextInt();
        int L = sc.nextInt();
        int a = (S + L) % 24;
        int tidur;
        if (a < 9){
            tidur = 9 - a;
        }else{
            tidur = 0;
        }
        System.out.println(tidur);
    }
}

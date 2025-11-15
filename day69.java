package evaluasi.pkg4;

import java.util.Scanner;

public class day69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        int totalBelanja = 0;
        
        do{
            System.out.println("Selamat Datang di Warung Sederhana!");
            System.out.println("Menu Makanan : ");
            System.out.println("1. Nasi Goreng  (Rp 15.000)");
            System.out.println("2. Mie Ayam (Rp 12.000)");
            System.out.println("3. Bakso (Rp 10.000)");
            System.out.println("4. Es Teh Manis (Rp 5.000)");
            System.out.println("0. Selesai & Bayar");
            System.out.println("--------------------------------");
            System.out.println("Total Belanja Saat Ini : Rp " );
            System.out.println("Masukkan pilihan Anda (0-4): ");
            pilihan = sc.nextInt();
            
            switch(pilihan){
                case 1:
                    totalBelanja += 15000;
                    System.out.println("Menambahkan Nasi Goreng");
                    break;
                case 2:
                    totalBelanja += 12000;
                    System.out.println("Menambahkan Mie Ayam");
                    break;
                case 3:
                    totalBelanja += 10000;
                    System.out.println("Menambahkan Bakso");
                    break;
                case 4:
                    totalBelanja += 5000;
                    System.out.println("Menambahkan Es Teh Manis");
                    break;
                case 0:
                    System.out.println("Menghitung total");
                    break;
                    default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");
                
            }
        } while (pilihan != 0);
        System.out.println("Total Belanja Anda : Rp " + totalBelanja);
        System.out.print("Masukkan Uang Anda : Rp ");
        int uangBayar = sc.nextInt();
        
        while(uangBayar < totalBelanja){
            System.out.println("Maaf, uang Anda kurang Rp " + (totalBelanja - uangBayar));
            System.out.print("Silahkan masukkan jumlah uang yang cukup: Rp");
            uangBayar = sc.nextInt();
            
        }
        int kembalian = uangBayar - totalBelanja;
        System.out.println("--- Struk Pembayaran ---");
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Uang Bayar    : Rp " + uangBayar);
        System.out.println("Kembalian     : Rp " + kembalian);
        System.out.println("---------------------------------");
        System.out.println("Terima kasih telah berbelanja!");
        
    }
    
}

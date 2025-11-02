import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do{
            System.out.println("--- MENU APLIKASI ---");
            System.out.println("1. Tampilkan Pesan Halo");
            System.out.println("2. Tampilkan Pesan Selamat Tinggal");
            System.out.println("3. Keluar");
            System.out.println("Masukkan pilihan Anda (1-3) : ");
            pilihan = sc.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println(">>> Halo, Selamat Datang!");
                    break;
                case 2:
                    System.out.println(">>> Selamat Tinggal!");
                    break;
                case 3:
                    System.out.println(">>> Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }while (pilihan !=3);
    }
    
}

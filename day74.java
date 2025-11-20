import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilihan;
        int totalBiaya = 0;
        
        do{
            System.out.println("Menu : ");
            System.out.println("1. Nasi Kuning Rp 10.000");
            System.out.println("2. Es Teh Panas Rp 5.000");
            System.out.println("3. Kopi Susu Rp 5.000");
            System.out.println("4. Bakso Kuah Rp 10.000");
            System.out.println("5. Selesaikan pembayaran");
            System.out.println("Pilih menu yang akan anda pesan : ");
            pilihan = sc.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("Anda memilih nasi kuning Rp 10.000");
                    totalBiaya += 10000;
                    break;
                case 2:
                    System.out.println("Anda memilih es teh panas Rp 5.000");
                   totalBiaya += 5000;
                    break;
                case 3:
                    System.out.println("Anda memilih kopi susu Rp 5.000");
                    totalBiaya += 5000;
                    break;
                case 4:
                    System.out.println("Anda memilih bakso kuah Rp 10.000");
                    totalBiaya += 10000;
                    break;
                case 5:
                    if(totalBiaya == 0){
                        System.out.println("Anda tidak berbelanja");
                    }else{
                        System.out.println("Total biaya belanja Anda adalah Rp " + totalBiaya);
                        System.out.println("Terima kasih telah berbelanja");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;   
            }
        }while(pilihan != 5);
        
    }
}

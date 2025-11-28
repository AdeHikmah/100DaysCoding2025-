import java.util.Scanner;
public class day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Berapa jumlah tamu yang ingin di catat : ");
        int jumlah = input.nextInt();
        input.nextLine(); 
        String [] tamu = new String [jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i + 1) + ": ");
            tamu[i] = input.nextLine();
        }
        
        System.out.println("\n---  DAFTAR TAMU HADIR ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + tamu[i]);
        }
    } 
}

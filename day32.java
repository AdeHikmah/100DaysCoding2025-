import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        //operator logika OR
        Scanner sc = new Scanner (System.in);
        
        //input dari pengguna
        System.out.print("Apakah Anda anggota premium? (true/false): ");
        boolean premium = sc.nextBoolean();
        
        System.out.print("Apakah anda memiliki undangan khusus? (true/false): ");
        boolean undangan = sc.nextBoolean();
        
        //syarat dapat akses VIP
        boolean dapatAksesVip = premium || undangan;
        
        //hasil akhir 
        System.out.println("Apakah Anda mendapatkan akses VIP? " + dapatAksesVip);
    }
    
}

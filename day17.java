import java.util.Scanner;
public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah Permen : ");
        int P = sc.nextInt();
        
        System.out.print("Jumlah Murid : ");
        int M = sc.nextInt();
        
        //Hitung permen per murid
        int permenPerMurid = P / M;
        //Hitung sisa permen
        int sisaPermen = P % M;
        
        System.out.println("Banyak permen yang diterima setiap murid : " + permenPerMurid);
        System.out.println("Permen yang tersisa : " + sisaPermen);
    }
            
}

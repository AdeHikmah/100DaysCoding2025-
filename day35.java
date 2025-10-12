import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda : ");
        int umur = sc.nextInt();
        
        if(umur >= 21){
            System.out.println("Anda boleh menonton semua jenis film, termasuk film dewasa");
        }else if(umur >= 13){
            System.out.println("Anda hanya boleh menonton film remaja dan umum");
        }else{
            System.out.println("Maaf, Anda hanya boleh menonton film anak-anak");
        }
    }
   
}

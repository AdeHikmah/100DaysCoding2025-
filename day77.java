import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Hashtag : ");
        String teksAsli = sc.nextLine();
        
        String hasil = teksAsli.trim();
        hasil = hasil.replace("-", " ");
        hasil = hasil.substring(1);
        hasil = hasil.toUpperCase();
        
        System.out.println("\n--- Hasil Data Cleaning ---");
        System.out.println("Tag Asli : " + teksAsli);
        System.out.println("Tag Bersih : " + hasil);
        
    }
}

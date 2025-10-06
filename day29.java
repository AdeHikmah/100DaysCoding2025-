import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tinggi = input.nextDouble();
     
        System.out.print("Masukkan berat badan Anda (kg): ");
        double berat = input.nextDouble();
        
        //aturan keamanan
        boolean tinggiCukup = tinggi > 150;
        boolean beratCukup = berat < 80;
        
        System.out.println("\n--- HASIL PENGECEKAN ---");
        System.out.println("Tinggi badan Anda: " + tinggi + " cm");
        System.out.println("Berat badan Anda: " + berat + " kg");
        
        System.out.println("Apakah tinggi badan memenuhi syarat (>150 cm)? " + tinggiCukup);
        System.out.println("Apakah berat badan memenuhi syarat (<80 kg)? " + beratCukup);
        
        //narasi hasil akhir
        System.out.println("Apakah Anda di izinikankan naik wahana? " + (tinggiCukup && beratCukup));
        }
    }


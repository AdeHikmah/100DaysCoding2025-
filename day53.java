import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.println("--- Contoh break pada switch case ---");
        System.out.print("Masukkan nilai huruf (A-C) : ");
        char nilai = dk.next().charAt(0);
        
        switch (nilai){
            case 'A':
                System.out.println("Luar Biasa!");
                break;
            case 'B':
                System.out.println("Bagus!");
                break;
            case 'C':
                System.out.println("Cukup!");
                break;
            default:
                System.out.println("Nilai tidak valid!");
        }
        
        System.out.println("\n--- Contoh break pada perulangan ---");
        for (char huruf = 'A'; huruf <= 'Z'; huruf++) {
            if(huruf == 'E'){
                System.out.println("Berhenti di huruf " + huruf);
                break;
            }
            System.out.println("Huruf : " + huruf);
        }
    }
}

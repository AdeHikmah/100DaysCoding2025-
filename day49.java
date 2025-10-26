import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        System.out.print("Masukkan suhu sekarang : ");
        int suhu = dk.nextInt();
        
        //ternary untuk menentukan cuaca
        String cuaca = (suhu >= 30) ? "Gila panas banget.." : (suhu >= 25) ? "Hangat tapi masih nyaman.." 
                : (suhu >= 20) ? "Agak sejuk.." : (suhu >= 15) ? "Udah mulai dingin.." : "Dingin banget gila..";
        
        System.out.println("Cuaca hari ini " + cuaca);
        
    }
}

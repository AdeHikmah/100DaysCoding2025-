import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan nilai lebar : ");
        int lebar = input.nextInt();
        
        //hitung luas persegi
        int luasPersegi = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang : " + luasPersegi);
    }
}

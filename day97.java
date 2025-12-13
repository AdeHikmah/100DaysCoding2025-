import java.util.Scanner;

public class day97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Program Hitung Luas Persegi ---");
        System.out.print("Masukkan panjang sisi : ");
        int sisi = sc.nextInt();
        
        int luas = hitungLuasPersegi(sisi);
        
        System.out.println("\nLuas Persegi dengan sisi " + sisi + " adalah : " + luas);
    }
    static int hitungLuasPersegi(int sisi){
        return sisi * sisi;
    }
}

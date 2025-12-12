import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan angka1 : ");        
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan angka2 : ");
        int angka2 = input.nextInt();
        
        int hasilTambah = tambah(angka1, angka2);
        int hasilKurang = kurang(angka1, angka2);
        int hasilKali = kali(angka1, angka2);
        double hasilBagi = bagi(angka1, angka2);
        
        System.out.println("/n---Hasil Operasi ---");
        System.out.println("Penjumlahan : " + hasilTambah);
        System.out.println("Pengurangan : " + hasilKurang);
        System.out.println("Perkalian : " + hasilKali);
        System.out.println("Pembagian : " + hasilBagi);
    }
    
    static int tambah(int a, int b){
        return a + b;
    }
    static int kurang(int a, int b){
        return a - b;
    }
    static int kali(int a, int b){
        return a * b;
    }
    static double bagi(int a, int b){
        return (double) a / b;
    }
}

import java.util.Scanner;
public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Menghitung jumlah total keramik ---");
        
        System.out.print("Masukkan Panjang Rumah : ");
        int P = sc.nextInt();
        System.out.print("Masukkan Lebar Rumah : ");
        int L = sc.nextInt();
        int sisiLantai = 2*2;
        
        int jumlah = (P*L)/sisiLantai;
        System.out.println("Jumlah keramik yang di butuhkan : " + jumlah);
        
        System.out.println("--- Menukar nilai 2 variabel ---");
        System.out.print("Masukkan angka1 : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka2 : ");
        int angka2 = sc.nextInt();
        
        angka1 = angka1 - angka2;
        angka2 = angka1 + angka2;
        angka1 = angka2 - angka1;
        System.out.println("angka1 setelah di tukar : " + angka1);
        System.out.println("angka2 setelah di tukar : " + angka2);
        
        
        
    }
}

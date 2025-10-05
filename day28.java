import java.util.Scanner;
public class day28 {
    public static void main(String[] args) {
        //operator perbandingan 
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan angka1 : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka2 : ");
        int angka2 = sc.nextInt();
        
        boolean x = angka1 == angka2;
        boolean y = angka1 != angka2;
        
        System.out.println("Apakah " +angka1+ " sama dengan " + angka2 + " ? " + x);
        System.out.println("Apakah " +angka1+ " tidak sama dengan " + angka2 + " ? " + y);
    }
}


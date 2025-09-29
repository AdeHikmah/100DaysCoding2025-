import java.util.Scanner;
public class day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input sisi persegi
        System.out.print("Masukkan nilai panjang sisi persegi: ");
        int sisiPersegi = input.nextInt();
        
        //Hitung luas
        int luasPersegi = sisiPersegi * sisiPersegi;
        
        //Output hasil
        System.out.printf("Luas persegi dengan sisi %d adalah: %d%n", sisiPersegi, luasPersegi);
    }
}

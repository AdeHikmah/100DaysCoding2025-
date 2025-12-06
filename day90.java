import java.util.Scanner;

public class day90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");
        int a = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua : ");
        int b = input.nextInt();
        
        int maksimum = maxx(a, b);
        int minimum = minn(a, b);
        
        System.out.println("\nNilai maksimum : " + maksimum);
        System.out.println("Nilai minimum : " + minimum);
    }
    static int maxx (int a, int b){
        if(a > b){
            return a; //mengembalikan nilai
        }else{
            return b; //mengembalikan nilai
        }
    }
     static int minn (int a, int b){
        if(a < b){
            return a; //mengembalikan nilai
        }else{
            return b; //mengembalikan nilai
        }
   }
}

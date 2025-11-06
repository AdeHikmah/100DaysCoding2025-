import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner exo = new Scanner(System.in);
        System.out.print("Masukkan batas angka (N) : ");
        int N = exo.nextInt();
        
        //ganjil N-1
        System.out.println("Angka genap dari " + N + " ke 1");
        for (int i = N; i >= 1; i--) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        //genap N-1
        System.out.println("Angka genap dari " + N + " ke 1");
        for (int i = N; i >= 1; i--) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
   
}

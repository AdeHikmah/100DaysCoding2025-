import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner exo = new Scanner(System.in);
        System.out.print("Masukkan batas angka (N) : ");
        int N = exo.nextInt();
        
        //ganjil 1-N
        System.out.println("Angka ganjil dari 1 hingga " + N + " ");
        for (int i = 1; i <= N; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        //genap 1-N
        System.out.println("Angka genap dari 1 hingga " + N + " ");
        for (int i = 1; i <= N; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
   
}

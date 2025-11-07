import java.util.Scanner;
public class day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas angka (N) : ");
        int N = sc.nextInt();
        
        System.out.print("Masukkan batas kelipatan (M) : ");
        int M = sc.nextInt();
        
        System.out.print("Kelipatan " + M + " antara 1 dan " + N + " : ");
        for (int i = M; i <= N; i+= M) {
            System.out.print(i + " ");
        }
    }
}

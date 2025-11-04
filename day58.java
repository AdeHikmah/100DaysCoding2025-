import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner svt = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = svt.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
        }
        
        System.out.println(" ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i);
        }
    }
}

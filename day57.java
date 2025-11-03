import java.util.Scanner;
public class day57 {
    public static void main(String[] args) {
        Scanner svt = new Scanner(System.in);
        System.out.print("Masukkan ukuran persegi : ");
        int ukuran = svt.nextInt();
        
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                if(i == 0 || i == ukuran - 1 || j == 0 || j == ukuran - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

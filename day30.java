import java.util.Scanner;

public class day30 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan umur (anak) : ");
int umur = sc.nextInt();
 
    boolean maksimal = umur >= 1;  
    boolean minimal = umur <= 5;  
  // syarat
    boolean syarat =! (maksimal ^ minimal);  

    System.out.println("Umur >= 1 ? " + maksimal);  
    System.out.println("Umur <= 5 ? " + minimal);  
    System.out.println("Apakah termasuk balita ? " + syarat);  
}

}

import java.util.Scanner;
public class day70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan angka baris : ");
		int baris = sc.nextInt();
		
		System.out.print("Masukkan angka kolom : ");
		int kolom = sc.nextInt();
		
		for(int i = 1; i <= baris; i++){
			for(int j = 1; j <= kolom; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

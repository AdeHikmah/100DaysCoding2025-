import java.util.Scanner;
public class day51 {
	public static void main(String[] args) {
		Scanner dk = new Scanner(System.in);
		System.out.print("Masukkan batas atas : ");
		int batasAtas = dk.nextInt();
		
		System.out.print("Masukkan angka yang ingin di kalikan : ");
		int angka = dk.nextInt();
		
		
		System.out.println("Tabel Perkalian " + angka + " sampai " + batasAtas);
		for(int i = 1; i <= batasAtas; i++){
			System.out.println(i + " x " + angka + " = " + (i * angka));
		}
	}
}

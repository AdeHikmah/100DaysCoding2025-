import java.util.Scanner;
public class  day50 {
	public static void main(String[] args) {
		Scanner dk = new Scanner (System.in);
		System.out.print("Masukkan angka : ");
		int angka = dk.nextInt();
		int hasil = angka % 2;
		String kondisi = hasil == 0? "Genap" : "Ganjil";
		System.out.println(kondisi);
	}
	
}

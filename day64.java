import java.util.Scanner;
public class day64 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan angka (M) : ");
		int M = sc.nextInt();
		
		System.out.print("Masukkan angka (N) : ");
		int N = sc.nextInt();
		
		int hasil = 1;
		
		for(int i = 1; i <= N; i++){
			hasil *= M;
	}
	System.out.println("Hasil pangkat " + M + "^" + N + " adalah : " + hasil);
	}
}

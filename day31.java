import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //input data dari pengguna 
        System.out.print("Masukkan nilai tes logika: ");
        int nilai = sc.nextInt();
        System.out.print("Masukkan pengalaman coding (tahun): ");
        int pengalaman = sc.nextInt();
        
        //pengecekan syarat pendaftaran
        boolean diterima = (nilai >= 80) && (pengalaman > 2);
        
        //hasil akhir
        System.out.println("Apakah calon anggota diterima di Elite Coder? " + diterima);
    }
}

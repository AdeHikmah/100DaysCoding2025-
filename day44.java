import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Mata Kuliah    : ");
        String matkul = sc.nextLine();
        System.out.print("Masukkan Nilai (0-100)  : ");
        double nilai = sc.nextDouble();
        
        String predikat;
        if(nilai > 90 && nilai <= 100 ){
            predikat = "A";
        }else if(nilai > 80 && nilai <= 90){
            predikat = "B";
        }else if(nilai > 70 && nilai <= 80){
            predikat = "C";
        }else if(nilai > 60 && nilai <= 70){
            predikat = "D";
        }else{
            predikat = "E";
        }
        
        System.out.println("\n=== HASIL PEMBELAJARAN SELAMA 1 SEMESTER ===");
        System.out.printf("Nama            : %s%n", nama);
        System.out.printf("Mata Kuliah     : %s%n", matkul);
        System.out.printf("Nilai Akhir     : %.1f%n", nilai);
        System.out.printf("Predikat Nilai  : %s%n", predikat);
        System.out.printf("%nPada mata kuliah %s, %s telah mendapat nilai %s.%n", matkul, nama, predikat);
    }
}

import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7) : ");
        int angka = sc.nextInt();
        String hari;
        
        switch (angka){
            case 1:
                hari = "Senin";
                break;
           case 2:
                hari = "Selasa";
                break;
           case 3:
                hari = "Rabu";
                break;
           case 4:
                hari = "Kamis";
                break;
           case 5:
                hari = "Jumat";
                break;
           case 6:
                hari = "Sabtu";
                break;
           case 7:
                hari = "Minggu";
                break;
           default:
               hari = "Jumlah hari hanya 7.";
        }
        
        if(angka >=1 && angka <= 5){
            System.out.println(hari + " adalah hari kerja.");
        }else if (angka >= 6 && angka <= 7){
            System.out.println(hari + " adalah hari libur");
        }else{
            System.out.println(hari);
        }
    }
}

import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas bawah : ");
        int batasBawah = sc.nextInt();
        System.out.print("Masukkan batas atas : ");
        int batasAtas = sc.nextInt();
        System.out.print("Masukkan bilangan bulat : ");
        int bulat = sc.nextInt();   
        
        if(bulat >= batasBawah && bulat <= batasAtas){
            System.out.println("YAYAYAYA");
        }else{
            System.out.println("NONONONO");
        }
    }
    
}

import java.util.Scanner;
public class day55b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        if(nilai > 70){
            System.out.println("Ujian Kroco Ji Pale");
        }else{
            System.out.println("Sa Jappo'ka Aih");
        }
    }
}

import java.util.Scanner;

public class day55c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Iyaji");
        }else{
            System.out.println("Tidakji");
        }
    }
}


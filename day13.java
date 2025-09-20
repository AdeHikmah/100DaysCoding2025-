import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Judul: ");
        final String  JUDUL = sc.nextLine();
        System.out.print("Masukkan tahun: ");
        short tahun = sc.nextShort();
        sc.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan kecepatan: ");
        byte perjalanan = sc.nextByte();
        System.out.print("Masukkan harga: ");
        int harga = sc.nextInt();
        System.out.print("Masukkan nama kendaraan: ");
        char kendaraan = sc.next().charAt(0);
        System.out.print("Jumlah hari: ");
        float hari = sc.nextFloat();
        System.out.print("Kecepatan: ");
        double kecepatan = sc.nextDouble();
        System.out.print("Total biaya: ");
        long totalBiaya = sc.nextLong();
        System.out.print("Status Perjalanan: ");
        boolean status = sc.hasNextBoolean();
        
        System.out.println("Judul: " + JUDUL);
        System.out.print("Pada tahun " + tahun + ", ");
        System.out.print("seorang mahasiswa bernama " + nama);
        System.out.print(" melakukan perjalanan sejauh " + perjalanan + " km");
        System.out.print(" \nhanya demi makan ayam geprek seharga " + harga + " rupiah. ");
        System.out.print("Ia mengujungi 3 kota dengan menggunakan kendaraan berinisial " + kendaraan + ". ");
        System.out.print("\nPerjalanan tersebut memakan waktu " + hari + " hari ");
        System.out.print("dengan rata-rata kecepatan " + kecepatan + "km/jam. ");
        System.out.print("\nTotal biaya perjalanan mencapai " + totalBiaya + " rupiah.");
        System.out.println("");
        System.out.println("Status perjalanan : " + status);
    }
}


import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan universitas: ");
        String uni = sc.nextLine();
        
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan semester : ");
        int semester = sc.nextInt();
        
        System.out.print("Masukkan jumlah sks : ");
        byte sks = sc.nextByte();
        
        System.out.print("Masukkan tahun masuk : ");
        short tahun = sc.nextShort();
        
        System.out.print("Masukkan IPK : ");
        float ipk = sc.nextFloat();
        
        System.out.print("Masukkan tingi badan : ");
        double tB = sc.nextDouble();
        
        System.out.print("Masukkan gender (L/P) : ");
        char gender = sc.next().charAt(0);
        
        System.out.print("Masukkan status perkuliahan : ");
        boolean status = sc.hasNextBoolean();
        
        System.out.println("\n==================");
        System.out.print(" BIODATA MAHASISWA ");
        System.out.println("\n==================");
        System.out.printf("%-15s : %-10s %n","Universitas", uni);
        System.out.printf("%-15s : %-10s %n", "Nama" ,nama);
        System.out.printf("%-15s : %-10s %n", "NIM" ,nim);
        System.out.printf("%-15s : %-10d %n","Semester", semester);
        System.out.printf("%-15s : %-10d %n","Jumlah sks", sks);
        System.out.printf("%-15s : %-10d %n","Tahun Masuk", tahun);
        System.out.printf("%-15s : %-10f %n","IPK" , ipk);
        System.out.printf("%-15s : %-10f %n","Tinggi Badan" , tB);
        System.out.printf("%-15s : %-10c %n","Jenis Kelamin" , gender);
        System.out.printf("%-15s : %-10b %n","Status Aktif", status);
    }
          
}

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai r: ");
        int r = sc.nextInt();
        System.out.print("Masukkan nilai phi: ");
        final double phi = sc.nextDouble();
        double luas= phi*(r*r);
        double Keliling = 2*phi*r;
        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + Keliling);
        
        //Update nilai r
        System.out.print("Masukkan nilai r lagi: ");
        r = sc.nextInt();
        luas= phi*(r*r);
        Keliling = 2*phi*r;
        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + Keliling);
    }
}

public class day7 {
    public static void main(String[] args) {
        // ===== Tugas 1: Cetak kata dengan char =====
        char a = '안';
        char n = '녕';
        char h = '하';
        char s = '세';
        char y = '요';
        
        System.out.print(a);
        System.out.print(n);
        System.out.print(h);
        System.out.print(s);
        System.out.print(y);
        System.out.println(); // pindah baris

        // ===== Tugas 2: Cetak kondisi boolean =====
        boolean isHujan = false;       //sekarang tidak hujan
        boolean isSiang = false;       //sekarang bukan siang
        boolean isAkhirPekan = true;   //karena sekarang Minggu

        System.out.println("Apakah sekarang hujan? " + isHujan);
        System.out.println("Apakah sekarang siang hari? " + isSiang);
        System.out.println("Apakah sekarang akhir pekan? " + isAkhirPekan);
    }
}

public class day91 {
    public static void main(String[] args) {

        hitungGaji("Aika", 5);
        hitungGaji("Kayla", 8);

    }

    static void hitungGaji(String nama, int jumlahJamKerja) {
        int gaji = jumlahJamKerja * 50000;
        System.out.println("Karyawan " + nama + " bekerja " + jumlahJamKerja + " jam, mendapatkan gaji Rp " + gaji);
    }
}

public class day81 {
    public static void main(String[] args) {
        
        int [] nilai = {85, 90, 78, 88, 95};
        
        System.out.println("--- DATA NILAI AWAL ---");
        System.out.println("Nilai Siswa pertama : " + nilai[0]);
        System.out.println("Nilai Siswa terakhir : " + nilai[4]);
        
        System.out.println("\n--- UPDATE DATA ---");
        System.out.println("Nilai Siswa ketiga sebelum remedial : " + nilai[2]);
        nilai[2] = 100;
        System.out.println("Nilai Siswa ketiga setelah remedial : " + nilai[2]);
        
        System.out.println("\n--- OPERASI MATEMATIKA ---");
        double rataRata = (nilai[0] + nilai[1]) /2.0;
        System.out.println("Rata rata nilai Siswa 1 & Siswa 2 : " + rataRata);
    }
    
}

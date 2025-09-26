public class day19 {
    public static void main(String[] args) {
        //Konversi paksa dari tipe data besar ke tipe data kecil
        double angkaDesimal = 127.023;
        int angkaBulat = (int)angkaDesimal;
        
        System.out.println("Nilai asli (double) : " + angkaDesimal);
        System.out.println("Nilai setelah cast ke int : " + angkaBulat);
    }
}

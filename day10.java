public class day10 {
    public static void main(String[] args) {
        // Kecepatan cahaya di ruang hampa nilainya tetap (konstanta)
        final double C = 299792458; // meter per detik
        double waktu = 2.5; // detik
        double jarak = C * waktu;

        System.out.println("Kecepatan cahaya: " + C + " m/s");
        System.out.println("Jarak tempuh cahaya dalam " + waktu + " detik: " + jarak + " meter");
    }
}

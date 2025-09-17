public class day10 {
    public static void main(String[] args) {
        // Konstanta adalah variabel yang nilainya tetap (tidak bisa diubah setelah didefinisikan)
        // Penulisannya menggunakan keyword 'final'

        final int MAX_USER = 100; // Konstanta untuk batas maksimum user

        // Cetak konstanta ke layar
        System.out.println("Jumlah maksimum user = " + MAX_USER);

        // Jika mencoba mengubah nilai konstanta, program akan error
        // Contoh: MAX_USER = 200;  <-- tidak diperbolehkan
    }
}

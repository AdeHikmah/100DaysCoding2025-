public class day95 {
    public static void main(String[] args) {
        System.out.println("--- Tes Gambar Segitiga (Tinggi 5, Pakai #) ---");
        gambarSegitiga(5, '#');
        
        System.out.println("--- Tes Gambar Segitiga (Tinggi 4, Pakai $) ---");
        gambarSegitiga(4, '$');
        
        System.out.println("\n--- Tes Cetak Struk ---");
        cetakStruk("Kopi Susu", 15000, 2);
        cetakStruk("Nasi Goreng", 25000, 1);
        
        
    }
    static void gambarSegitiga(int tinggi, char simbol){
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbol + " ");
            }
            System.out.println();
        }
    }
    static void cetakStruk(String namaBarang, int harga, int jumlah){
        int total = harga * jumlah;
        System.out.println("Barang : " + namaBarang);
        System.out.println("Qty : " + jumlah + " x " + harga);
        System.out.println("Total : " + total);
        
        System.out.println("------------------");
    }
}

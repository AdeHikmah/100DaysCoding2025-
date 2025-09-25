public class day18 {
    public static void main(String[] args) {
        //Deklarasi variabel harga barang (bulat)
        int hargaBarang = 150000;
        
        //Deklarasi variabel pajak (desimal)
        double pajak = 16500.50;
        
        /*
        hasil penjumlahan harga barang dan pajak
        double digunakan agar nilai desimal dari pajak tidak hilang
        */
        double totalBayar = hargaBarang + pajak;
        
        System.out.println("Total harga yang harus dibayar : " + totalBayar);
    }
}

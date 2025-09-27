public class day20 {
    public static void main(String[] args) {
        //Data karyawan baru
        int tahunMasuk = 2015;
        int nomorUrut = 17;
        
        //Konversi int ke String dan pembentukan ID Karyawan
        final String ID_KARYAWAN = "KRY-" + String.valueOf(tahunMasuk) + "-" + String.valueOf(nomorUrut);
        
        //cetak ID Karyawan
        System.out.println("ID Karyawan yang berhasil dibuat: " + ID_KARYAWAN);
    }
  
}

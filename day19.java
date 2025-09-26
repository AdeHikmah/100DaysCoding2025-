public class day19 {
    public static void main(String[] args) {
        //Konversi paksa dari tipe data besar ke tipe data kecil
        double angkaDesimal = 127.023;
        int angkaBulat = (int)angkaDesimal;
        
        System.out.println("Nilai asli (double) : " + angkaDesimal);
        System.out.println("Nilai setelah cast ke int : " + angkaBulat);
    }
}


public class LatihanDay19 {
    public static void main(String[] args) {
        //Posisi presisi karakter
        double posisiX = 15.85;
        double posisiY = 9.25;
        
        //Narrowing casting untuk mengubah kedua posisi double tersebut menjadi grid
        int gridX = (int)posisiX;
        int gridY = (int)posisiY;
        
        /*
        Cetak posisi asli (double) dan 
        posisi grid hasil casting (int)
        */       
        System.out.println("Posisi asli (double) : " + posisiX + ", " + posisiY);
        System.out.println("Hasil casting (int) : " + gridX + ", " + gridY);
       
        //Posisi item kunci
        int kunciX = 15;
        int kunciY = 9;
        
        if(gridX == kunciX && gridY == kunciY){
            System.out.println("Karakter berhasil mengambil kunci");
        }else{
            System.out.println("Karakter gagal mengambil kunci");
        }
        
    }
 
}

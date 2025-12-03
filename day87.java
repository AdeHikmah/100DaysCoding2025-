import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String [] buku = {
        "Harry Potter", 
        "Lord of the Rings",
        "Alchemist",
        "Sherlock Holmes",
        "Hobbit"
        };
        
        System.out.println("--- CARI BUKU ---");
        System.out.print("Masukkan judul buku : ");
        String judulBuku = sc.nextLine();
        
        boolean ditemukan = false;
        
        for (int i = 0; i < buku.length; i++) {
            if(buku[i].equalsIgnoreCase(judulBuku)){
                System.out.println("\nHasil : Buku " + buku[i] + " ditemukan di indeks ke-" + i + "(Tumpukan ke-" + (i+1) + ").");
                ditemukan = true;
            }
        }
        if(!ditemukan){
            System.out.println("\nHasil : Maaf, buku tidak ada di tumpukan");
        }
    }
}

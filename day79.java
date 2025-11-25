import java.util.Scanner;
public class day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- SISTEM REGISTRASI AKUN ---");
        System.out.print("Buat username : ");
        String username = sc.nextLine().trim();
        
        System.out.print("Buat password : ");
        String password = sc.nextLine();
        
        System.out.println("\n--- LOGIN AKUN ---");
        
        while(true){
            System.out.print("Masukkan username : ");
            String loginUser = sc.nextLine();
            
            System.out.print("Masukkan password : ");
            String loginPassword = sc.nextLine();
            
            if(loginUser.equals(username) && loginPassword.equals(password)){
                System.out.println("\nLogin Berhasil");
                break;
            }else{
                System.out.println("Gagal: Username atau Password salah! Silahkan coba lagi.\n");
            }
        }
    }
}

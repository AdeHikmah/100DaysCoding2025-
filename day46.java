import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("--- Menu Minuman ---");
        System.out.println("1. Matcha Latte");
        System.out.println("2. Lychee Yakult");
        System.out.println("3. Choco Hazelnut");
        System.out.println("4. Taro Cheese");
        System.out.println("5. Air Mineral");
        System.out.println("Masukkan angka (1-5) : ");
        int angka = sc.nextInt();
        String menu;
        
        switch (angka){
            case 1:
                menu = "Matcha Latte";
                break;
            case 2:
                menu = "Lychee Yakult";
                break;
            case 3:
                menu = "Choco Hazelnut";
                break;
            case 4:
                menu = "Taro Cheese";
                break;
            case 5:
                menu = "Air Mineral";
                break;
            default:
                menu = "Menu tidak valid.";
                
        }
        System.out.println(menu);
    }
}

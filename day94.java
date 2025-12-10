public class day94 {

    public static void main(String[] args) {

        garisPembatas();
        kotakNama("Lia");
        garisPembatas();

        System.out.println("Menu Pilihan:");
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("3. Exit");

        garisPembatas();
    }

    static void garisPembatas() {
        System.out.println("================================");
    }

    static void kotakNama(String nama) {
        System.out.println("|   Welcome, Player " + nama + "    |");
    }
}

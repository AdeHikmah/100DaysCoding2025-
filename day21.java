public class day21 {
    public static void main(String[] args) {
        int angka1 = 17;
        int angka2 = 13;
        
        System.out.println("--- Sebelum di tukar ---");
        System.out.printf("Nilai angka1 : %d%n",  angka1);
        System.out.printf("Nilai angka2 : %d%n", angka2);
        
        angka1 = angka1 - angka2;
        angka2 = angka1 + angka2;
        angka1 = angka2 - angka1;
        
        System.out.println("--- Setelah di tukar ---");
        System.out.printf("Nilai angka1 : %d%n",  angka1);
        System.out.printf("Nilai angka2 : %d%n", angka2);
    }
  
}

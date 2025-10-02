public class day25 {
    public static void main(String[] args) {
        System.out.println("INCREMENT PRE - POST");
        int x = 3;
        int y, z;
        
        // Contoh Pre-increment
        y = ++x; // x ditambah dulu, lalu disimpan ke y
        System.out.println("--- Contoh Pre-Increment ---");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y (hasil ++x): " + y);
        
        // reset nilai x 
        x = 3;
        
        // Contoh Post-Increment
        z = x++; // x dipakai dulu, baru ditambah
        System.out.println("\n--- Contoh Post-Increment ---");
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai z (hasil x++): " + z);
        
        System.out.println("\nDECREMENT PRE - POST");
        int a = 3;
        int b, c;
        
        // Contoh Pre-Decrement
        b = --a; // a dikurangi dulu, lalu disimpan ke b
        System.out.println("\n--- Contoh Pre-Decrement ---");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b (hasil --a): " + b);
        
        // reset nilai a
        a = 3;
        
        // Contoh Post-Decrement
        c = a--; // a dipakai dulu, baru dikurangi
        System.out.println("\n--- Contoh Post-Decrement ---");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai c (hasil a--): " + c);
    }
}

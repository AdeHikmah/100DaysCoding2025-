public class day26 {
    public static void main(String[] args) {
        System.out.println("--- Penugasan Aritmatika ---");
        int a = 17;
        a += 2; // 17 + 2 = 19
        System.out.println("Nilai a += 2 : " + a);
        
        a -= 3; // 19 - 3 = 16
        System.out.println("Nilai a -= 3 : " + a);
        
        a *= 2;  //16 * 2 = 32
        System.out.println("Nilai a *= 2 : " + a);
        
        a /= 4; // 32 / 4 = 8
        System.out.println("Nilai a /= 4 : " + a);
        
        a %= 6; // 8 % 6 = 2
        System.out.println("Nilai a %= 6 : " + a);

        System.out.println("\n--- Penugasan Bitwise ---");
        
        int b = 9;
        b &= 3; // 9 & 3 = 1
        System.out.println("Nilai b &= 3 : " + b);
        
        b |= 6; // 1 | 6 = 7
        System.out.println("Nilai b |= 6 : " + b);
        
        b ^= 3; // 7 ^ 3 = 4
        System.out.println("Nilai b ^= 3 : "+ b);
        
        b <<= 2; // 4 << 2 = 16
        System.out.println("Nilai b <<= 2 : " + b);
        
        b >>= 2; // 16 >> 2 = 4
        System.out.println("Nilai b >>= 2 : " + b);
        
       
    }
}

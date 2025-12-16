import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean ketemuI = false;
        boolean ketemuS = false;
        boolean ketemuC = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!ketemuI && ch == 'I') {
                ketemuI = true;
            } 
            else if (ketemuI && !ketemuS && ch == 'S') {
                ketemuS = true;
            } 
            else if (ketemuI && ketemuS && ch == 'C') {
                ketemuC = true;
                break;
            }
        }

        if (ketemuI && ketemuS && ketemuC) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}

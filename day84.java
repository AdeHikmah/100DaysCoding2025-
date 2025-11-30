import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }
    }
}

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Iccang");
        }
    }
}

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kata = sc.nextLine();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(kata);
        }
    }
}

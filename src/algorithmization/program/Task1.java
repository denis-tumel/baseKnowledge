package algorithmization.program;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a, b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("NOK - "+nok(a, b));
        System.out.println("NOD - "+nod(a, b));// 4 6
    }

    private static int nok(int a, int b) {
        return a * (b/nod(a, b));
    }

    private static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }
}

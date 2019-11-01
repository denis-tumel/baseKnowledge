package algorithmization.program;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(execute(a, b, c));
    }

    private static boolean execute(int a, int b, int c){
        return nod(a, nod(b, c)) == 1;
    }

    private static int nod(int a, int b){
        return b == 0 ? a : nod(b, a % b);
    }
}

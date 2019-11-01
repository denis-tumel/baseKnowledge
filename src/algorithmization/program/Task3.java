package algorithmization.program;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a(сторона шестиугольника)");
        int a = sc.nextInt();
        System.out.println("Площадь шестиугольника - "+ execute(a));
    }

    private static double execute(int a) {
        return 6 * Math.pow(a, 2)/4 * Math.sqrt(3);
    }
}

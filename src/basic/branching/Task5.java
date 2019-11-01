package basic.branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 task = new Task5();
        task.start();
    }
    private void start() {
        System.out.println("Вычеслите функцию при X - ");// x - 7
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Ответ - "+result(x));
    }

    private Double result(int x) {
        if(x <= 3)
            return Math.pow(x, 2) - 3*x +9;// 0^2 - 3 * 0 + 9 == 9
        else
            return 1/(Math.pow(x, 3) + 6 );//1 / (7^3 + 6 = 343 + 6) == 1/349
    }
}

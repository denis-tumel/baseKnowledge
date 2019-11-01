package basic.linearProgram;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.start();
    }

    private void start() {
        System.out.println("Input a, b and c: ");
        Scanner sc = new Scanner(System.in);
        double result = calculate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("result - "+result);
    }

    private double calculate(int a, int b, int c) {
        return ((a-3)*(double)b/2)+c;
    }
}

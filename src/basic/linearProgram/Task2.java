package basic.linearProgram;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.start();
    }

    private void start() {
        System.out.println("Input a, b and c: ");
        Scanner sc = new Scanner(System.in);
        double result = calculate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("result - "+result);
    }

    private double calculate(int a, int b, int c) {
        return (((b + Math.sqrt(Math.pow(b, 2)+4*a*c) )/2*a)-Math.pow(a, 3)*c+1/Math.pow(b, 2));
    }
}

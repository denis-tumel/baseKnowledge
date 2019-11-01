package basic.linearProgram;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        task.start();
    }

    private void start() {
        System.out.println("Input a and b: ");
        Scanner sc = new Scanner(System.in);
        double result = calculate(sc.nextInt(), sc.nextInt());
        System.out.println("result: "+result);
    }

    private double calculate(int a, int b) {
        return ((Math.sin(a) + Math.cos(b))/(Math.cos(a) - Math.sin(b)))*Math.tan(a*b);
    }
}

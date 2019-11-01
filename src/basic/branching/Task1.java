package basic.branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.start();
    }
    private void start() {
        System.out.println("Input a, b in degree: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Exist - "+result(a, b)+ " Rectangular - "+ isRectangle(a, b));
    }

    private boolean isRectangle(int a, int b) {
        return a == 90 || b == 90 || 180 - (a + b) == 90;
    }

    private boolean result(int a, int b) {
        return a + b <= 180;
    }
}

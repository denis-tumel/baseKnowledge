package basic.branching;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Task3 {
    public static void main(String[] args) {
        Task3 task = new Task3();
        task.start();
    }
    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A(x1,y1): ");
        System.out.println("x1: ");
        int x1 = sc.nextInt();
        System.out.println("y1: ");
        int y1 = sc.nextInt();
        System.out.println("Input B(x2,y2): ");
        System.out.println("x2: ");
        int x2 = sc.nextInt();
        System.out.println("y2: ");
        int y2 = sc.nextInt();
        System.out.println("Input C(x3,y3): ");
        System.out.println("x3: ");
        int x3 = sc.nextInt();
        System.out.println("y3: ");
        int y3 = sc.nextInt();
        if(isOneLine(x1,y1,x2,y2,x3,y3))
            System.out.println("Леажат на одной линии");
        else System.out.println("Не на одной линии");
    }

    private boolean isOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = sqrt(pow(abs(x1-x2), 2)+pow(abs(y1-y2), 2));
        double b = sqrt(pow(abs(x2-x3), 2)+pow(abs(y2-y3), 2));
        double c = sqrt(pow(abs(x1-x3), 2)+pow(abs(y1-y3), 2));
        double p = (a+b+c)/2;
        return (sqrt(p*(p-a)*(p-b)*(p-c)) == 0);

    }

}

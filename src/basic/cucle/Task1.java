package basic.cucle;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.start();
    }

    private void start() {
        System.out.println("Input value A: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println("Count all value - "+result(value));
        System.out.println("Count all value(recursion) - "+resultR(value));// рекурсия. Рекурсия это высозов функции сам себя
    }

    private Integer resultR(int value) {
        if(value <= 1)
            return 1;
        return value + resultR(value-1);
    }

    private Integer result(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++){
            result += i;
        }
        return result;
    }

}
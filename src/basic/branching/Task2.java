package basic.branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.start();
    }
    private void start() {
        System.out.println("Input a, b, c, d: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Max value - "+max(min(sc.nextInt(),sc.nextInt()),min(sc.nextInt(),sc.nextInt())));
    }

    private Integer max(int valueOne, int valueTwo){
        return valueOne > valueTwo ? valueOne : valueTwo;
    }

    private Integer min(int valueOne, int valueTwo){
        return valueOne < valueTwo ? valueOne : valueTwo;
    }

}

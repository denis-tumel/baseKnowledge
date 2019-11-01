package basic.linearProgram;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 task = new Task4();
        task.start();
    }

    private void start() {
        System.out.println("Input R: ");
        Scanner sc = new Scanner(System.in);
        float result = (float) calculate(sc.nextFloat());
        System.out.println("result - "+result);
    }

    private double calculate(float r) {
        String string = String.valueOf(r);
        String[] s = string.split(",", 2);
        return Float.valueOf(s[1].concat(".").concat(s[0]));
    }
}

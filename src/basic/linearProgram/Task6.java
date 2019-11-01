package basic.linearProgram;

import java.util.Scanner;

public class Task6 {// это класс
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите две цифры X, Y");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println("Ваши цифры - "+X+", "+Y);

        if(X > -5 && X < 5 && Y > -4 && Y < 1 || X > -3 && X < 3 && Y > -1 && Y < 5)
            System.out.println(true);
        else System.out.println(false);
    }
}

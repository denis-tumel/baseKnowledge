package basic.cucle;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task = new Task6();
        System.out.println("Введите строку - ");
        Scanner sc = new Scanner(System.in);
        String string= sc.nextLine();
        task.start(string);
    }

    private void start(String str) {
        char[] chars = str.toCharArray();
        for (char ch : chars){
            System.out.println((int)ch);
        }
    }
}

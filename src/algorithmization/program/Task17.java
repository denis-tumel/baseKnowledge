package algorithmization.program;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.print("Ввудите n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("колличество раз - "+execute(n));
    }

    private static int execute(int n){
        int count = 0;
        while (n != 0){
            int minus = 0;
            char[] charArray = String.valueOf(n).toCharArray();

            for (char c : charArray) {
                minus += Integer.parseInt(String.valueOf(c));
            }
            System.out.println(minus);
            n -= minus;
            count++;
        }
        return count;
    }
}

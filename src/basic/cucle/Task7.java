package basic.cucle;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Task7 task = new Task7();
        System.out.print("Введите m и n - ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        task.start(m, n);
    }

    private void start(int m, int n) {
        StringBuilder result = new StringBuilder();
        while (m <= n){
            result.append("For ").append(m).append(" - ");
            for(int i = 2; i < m; i++){
                if(m % i == 0)
                    result.append(i).append(",");
            }
            m++;
            result.append("\n");
        }
        System.out.println(result);
    }
}

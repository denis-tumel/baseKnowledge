package basic.cucle;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Task8 task = new Task8();
        System.out.print("Введите m и n - ");
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String n = sc.nextLine();
        task.start(m, n);
    }

    private void start(String m, String n) {
        StringBuilder stringBuilder = new StringBuilder();

        char[] x = m.toCharArray();
        char[] y = n.toCharArray();
        for(char i : x){
            for (char j : y){
                if(i == j)
                    stringBuilder.append(i);
            }
        }
        System.out.println(stringBuilder);
    }
}

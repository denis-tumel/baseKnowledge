package algorithmization.oneArrays;

import java.util.Scanner;

public class Task1 {

    private int[] array;

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.start();
    }

    private void start() {
        System.out.println("Input N - size array: ");
        Scanner sc = new Scanner(System.in);

        initialisationArray(sc.nextInt());

        System.out.println("Input K [0 - 10]: ");
        sc = new Scanner(System.in);

        int K = sc.nextInt();

        System.out.println("Sum - "+result(K));
    }

    private void initialisationArray(int N) {
        array = new int[N];
        int i = 0;
        while(i < N){
            array[i] = (int) (Math.random() * 10);
            i++;
        }
    }

    private int result(int K) {
        int result = 0;

        for (int value : array) {
            if (value % K == 0) {
                result += value;
            }
        }
        return result;
    }
}

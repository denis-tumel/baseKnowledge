package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    private int[] array;
    private int count = 0;

    public static void main(String[] args) {
        Task2 task = new Task2();
        task.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array - ");
        int size = sc.nextInt();
        initializeArray(size);
        System.out.println("Input Z - ");
        int Z = sc.nextInt();
        int[] newArray = newArray(array, Z);
        System.out.println("New array - "+Arrays.toString(newArray)+"\nCount replace - "+count);
    }

    private int[] newArray(int[] array, int Z) {
        for(int i = 0; i < array.length; i++){
            if (array[i] > Z){
                array[i] = Z;
                count++;
            }
        }
        return array;
    }

    private void initializeArray(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array - "+ Arrays.toString(array));
    }
}

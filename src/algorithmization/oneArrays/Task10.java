package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array " + Arrays.toString(array));

        System.out.printf("new array %s", Arrays.toString(execute(array)));
    }

    private static int[] execute(int[] array) {
        for (int i = 0; i < array.length; i += 2){
            array[i] = 0;
        }
        return array;
    }

    private static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

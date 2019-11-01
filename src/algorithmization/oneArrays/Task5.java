package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if(array[i] > i)
                System.out.print(array[i]+" ");
        }
    }

    private static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

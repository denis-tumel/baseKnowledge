package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    private static int countMin = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array " + Arrays.toString(array));
        int min = min(array);
        System.out.println("Array " + Arrays.toString(newArr(array, min)));
    }

    private static int[] newArr(int[] array, int min) {
        int[] newArr = new int[array.length - countMin];
        int temp = 0;
        for (int value : array) {
            if (value == min)
                continue;
            newArr[temp++] = value;
        }
        return newArr;
    }

    private static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    private static int min(int[] arr){
        int min = arr[0];
        for (int i : arr){
            if (i < min)
                min = i;
            else if(i == min)
                countMin++;

        }
        return min;
    }
}

package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array " + Arrays.toString(array));
        int sum = array[2] + array[3];

        for ( int i = 5; i < array.length; i++){
            boolean flag = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                sum += array[i];
        }
        System.out.printf("sum - %d", sum);
    }

    private static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

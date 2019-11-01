package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array " + Arrays.toString(array));

        System.out.printf("Variable %d", findVariable(array));
    }

    private static int findVariable(int[] array) {
        int maxCount = 1;
        int maxCountVariable = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++){
                if(array[i] == array[j])
                    count++;
            }
            if(count > maxCount){
                maxCount = count;
                maxCountVariable = array[i];
            }else if(count == maxCount && array[i] < maxCountVariable){
                    maxCountVariable = array[i];
            }
        }
        return maxCountVariable;
    }

    private static int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Task4 task = new Task4();
        task.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array = " + Arrays.toString(array));
        int[] newArray = newArray(array);
        System.out.println("New array - "+Arrays.toString(newArray));
    }

    private int[] newArray(int[] array) {
        int min = array[0];
        int indexMin = 0;
        int max = array[0];
        int indexMax = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                indexMin = i;
            } else if( array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
        return array;
    }

    private int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

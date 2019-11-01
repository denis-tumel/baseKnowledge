package algorithmization.oneArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private int countNegative = 0;
    private int countZero = 0;
    private int countPositive = 0;

    public static void main(String[] args) {
        Task3 task = new Task3();
        task.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size array - ");
        int size = sc.nextInt();
        int[] array = initializeArray(size);
        System.out.println("Array - "+ Arrays.toString(array));
        build(array);
    }

    private void build(int[] array) {
        for (int value : array){
            if(value < 0){
                countNegative++;
            }else if(value == 0){
                countZero++;
            }else{
                countPositive++;
            }
        }
        System.out.printf("Negative - %d\nPositive - %d\nZero - %d", countNegative, countPositive, countZero);
    }

    private int[] initializeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

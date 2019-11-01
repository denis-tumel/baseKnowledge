package algorithmization.twoArrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (even number) - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

        System.out.println("Input number column u want to change");

        int column_one = sc.nextInt();
        int column_two = sc.nextInt();

        changeMatrix(matrix, column_one-1, column_two-1);

    }

    private static void changeMatrix(int[][] matrix, int column_one, int column_two) {
        for (int x = 0; x < matrix.length; x++){
            int temp = matrix[x][column_one];
            matrix[x][column_one] = matrix[x][column_two];
            matrix[x][column_two] = temp;
        }
        viewMatrix(matrix);
    }

    private static void viewMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] initializeMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}

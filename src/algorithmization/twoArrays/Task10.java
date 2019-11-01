package algorithmization.twoArrays;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (even number) - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

        searchPositiveElement(matrix);
    }

    private static void searchPositiveElement(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] > 0)
                System.out.println(matrix[i][i]);
        }
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
                matrix[x][y] = (int) ((Math.random() * 20) - 10);
            }
        }
        return matrix;
    }
}

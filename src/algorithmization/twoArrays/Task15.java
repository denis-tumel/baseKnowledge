package algorithmization.twoArrays;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (even number) - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

        System.out.println();
        execute(matrix);
    }

    private static void execute(int[][] matrix) {
        int maxValue = matrix[0][0];

        for (int[] x : matrix){
            for (int y : x){
                if (y > maxValue)
                    maxValue = y;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 1; y < matrix[i].length; y += 2){
                matrix[i][y] = maxValue;
            }
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

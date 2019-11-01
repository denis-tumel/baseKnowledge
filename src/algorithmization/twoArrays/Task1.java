package algorithmization.twoArrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

    }

    private static void viewMatrix(int[][] matrix) {
        for (int[] matrix_x : matrix) {
            for (int matrix_y = 0; matrix_y < matrix_x.length; matrix_y += 2) {
                if (matrix[0][matrix_y] > matrix[matrix_x.length - 1][matrix_y])
                    System.out.printf("%d  ", matrix_x[matrix_y]);
            }
            System.out.println();
        }
    }

    private static int[][] initializeMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int matrix_x = 0; matrix_x < matrix.length; matrix_x++){
            for (int matrix_y = 0; matrix_y < matrix[matrix_x].length; matrix_y++){
                matrix[matrix_x][matrix_y] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}

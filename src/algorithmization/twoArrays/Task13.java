package algorithmization.twoArrays;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (m x n) - ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = initializeMatrix(m, n);

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

    private static int[][] initializeMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}

package algorithmization.twoArrays;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (m / n) - ");
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
        if (n > m){
            for (int x = 0; x < matrix.length; x++){
                for (int y = m; y < matrix[x].length; y++){
                    matrix[x][y] = 1;
                }
            }
        }

        for (int x = 0; x < m && x < n; x++){
            for (int k = 0; k <= x; k++){
                boolean flag = true;
                while (flag){
                    int temp = (int) (Math.random() * matrix.length);
                    if (matrix[temp][x] == 0){
                        matrix[temp][x] = 1;
                        flag = false;
                    }
                }
            }
        }
        return matrix;
    }
}

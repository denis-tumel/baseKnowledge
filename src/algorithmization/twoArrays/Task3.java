package algorithmization.twoArrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);
        System.out.println("Input k line, and p column");
        int k = sc.nextInt();
        int p = sc.nextInt();
        viewMatrix(matrix, k, p);

    }

    private static void viewMatrix(int[][] matrix, int k, int p) {
        for (int x = 0; x < matrix.length; x++) {
            for ( int y = 0; y < matrix[x].length; y++){
                if (x == k-1 || y == p-1){
                    System.out.print(matrix[x][y]+"  ");
                }else System.out.print("   ");
            } System.out.println();
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

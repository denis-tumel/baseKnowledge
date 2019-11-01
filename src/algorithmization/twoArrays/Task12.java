package algorithmization.twoArrays;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (even number) - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

        //sortLine(matrix);

        sortColumn(matrix);
    }

    private static void sortLine(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++){
            boolean flag = true;
            while (flag){
                flag = false;
                for (int j = 0; j < matrix[i].length-1; j++){
                    if (matrix[i][j+1] > matrix[i][j]){
                        int temp = matrix[i][j+1];
                        matrix[i][j+1] = matrix[i][j];
                        matrix[i][j] = temp;
                        flag = true;
                    }

                }
            }
        }
        System.out.println();
        viewMatrix(matrix);
    }

    private static void sortColumn(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            boolean flag = true;
            while (flag){
                flag = false;
                for (int j = 0; j < matrix[i].length-1; j++){
                    if(matrix[j+1][i] < matrix[j][i]){
                        int temp = matrix[j+1][i];
                        matrix[j+1][i] = matrix[j][i];
                        matrix[j][i] = temp;
                        flag = true;
                    }
                }
            }
        }
        System.out.println();
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

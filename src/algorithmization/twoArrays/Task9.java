package algorithmization.twoArrays;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (even number) - ");
        int size = sc.nextInt();
        int[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

        execute(matrix);
    }

    private static void execute(int[][] matrix) {
        int[] sumEveryColumn = new int[matrix.length];
        int maxValue = 0;
        int column = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sumEveryColumn[j] += matrix[i][j];
                if(i == matrix.length-1 && sumEveryColumn[j] > maxValue){
                    maxValue = sumEveryColumn[j];
                    column = j;
                }
            }
        }
        for (int i : sumEveryColumn)
            System.out.print(i+" ");

        System.out.println("\nMax column - "+(column+1));
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

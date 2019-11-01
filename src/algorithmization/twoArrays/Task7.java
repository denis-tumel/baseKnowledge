package algorithmization.twoArrays;

import java.util.Scanner;

public class Task7 {
    private static int countPositiveNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size matrix (even number) - ");
        int size = sc.nextInt();
        double[][] matrix = initializeMatrix(size);

        viewMatrix(matrix);

    }

    private static void viewMatrix(double[][] matrix) {
        for (double[] ints : matrix) {
            for (double anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }

        System.out.printf("Count positive number - %d", countPositiveNumber);
    }

    private static double[][] initializeMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = Math.sin((Math.pow(x, 2) - Math.pow(y, 2))/size);
                if (matrix[x][y] > 0)
                    countPositiveNumber++;
            }
        }
        return matrix;
    }
}

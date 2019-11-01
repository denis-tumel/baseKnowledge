package algorithmization.program;

import algorithmization.sorting.SortByShell;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Input N point - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = initialize(n);

        for (int[] i : array)
            for (int j : i)
            System.out.println(j+" ");
        int[][] point = execute(array);
        System.out.println("Point one: "+point[0][0]+" "+point[0][1]+"\nPoint two: "+point[1][0]+" "+point[1][1]);
    }

    private static int[][] execute(int[][] array){
        double maxSize = Integer.MIN_VALUE;
        int[][] result = new int[2][2];

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                double size = returnSize(array[i][0], array[i][1], array[j][0], array[j][1]);
                if (maxSize < size){
                    result[0][0] = array[i][0];
                    result[0][1] = array[i][1];
                    result[1][0] = array[j][0];
                    result[1][1] = array[j][1];
                    maxSize = size;
                }
            }
        }

        return result;
    }

    private static double returnSize(int x1, int y1, int x2, int y2) {
        return Math.pow((Math.pow(x1-x2, 2)) + (Math.pow(y1-y2,2)), 0.5);
    }

    private static int[][] initialize(int n){
        int[][] array = new int[n][2];
         for (int i = 0; i < array.length; i++){
             array[i][0] = (int)(Math.random()*20 - 10);
             array[i][1] = (int)(Math.random()*20 - 10);
         }
         return array;
    }
}

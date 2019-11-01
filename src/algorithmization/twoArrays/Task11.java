package algorithmization.twoArrays;

public class Task11 {
    public static void main(String[] args) {

        int[][] matrix = initializeMatrix();

        viewMatrix(matrix);

    }

    private static void viewMatrix(int[][] matrix) {
        boolean[] lineMatrix = new boolean[matrix.length];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int anInt : matrix[i]) {
                if(anInt == 5)
                    count++;
                System.out.print(anInt + "  ");
            }
            if (count > 2)
                lineMatrix[i] = true;
            count = 0;
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < lineMatrix.length; i++){
            if (lineMatrix[i]){
                for (int line : matrix[i])
                    System.out.printf("%d  ", line);
            }
            System.out.println();
        }
    }

    private static int[][] initializeMatrix() {
        int[][] matrix = new int[10][20];
        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = (int) (Math.random() * 15);
            }
        }
        return matrix;
    }
}

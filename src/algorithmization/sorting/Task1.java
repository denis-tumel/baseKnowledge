package algorithmization.sorting;

public class Task1 {
    public static void main(String[] args) {
        int k = 2;
        int[] arrayOne = initialize(5);
        viewArray(arrayOne);
        int[] arrayTwo = initialize(3);
        viewArray(arrayTwo);

        int[] result = execute(arrayOne, arrayTwo, k);

        viewArray(result);
    }

    private static int[] execute(int[] arrayOne, int[] arrayTwo, int k) {
        int[] newArr = new int[arrayOne.length+arrayTwo.length];
        int temp = 0;

        for (int i = 0; i < arrayOne.length; i++){
            if (i == k + 1){
                while (temp < arrayTwo.length){
                   newArr[i+temp] = arrayTwo[temp];
                   temp++;
                }
            }
            newArr[i+temp] =  arrayOne[i];
        }
        return newArr;
    }

    private static void viewArray(int[] result) {
        for (int i : result)
            System.out.print(i+" ");
        System.out.println();
    }

    private static int[] initialize(int i) {
        int[] a = new int[i];
        for (int k = 0; k < i; k++){
            a[k] = (int) (Math.random() * 10);
        }
        return a;
    }
}

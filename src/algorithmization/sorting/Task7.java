package algorithmization.sorting;

public class Task7 {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 7, 8, 13, 14, 20};
        int[] b = {2, 4, 5, 6, 10, 15, 21, 22};

        int[] result = execute(a, b);

        print(result);
    }

    private static void print(int[] result){
        for (int i : result)
            System.out.print(i+" ");
    }

    private static int[] execute(int[] a, int[] b) {
        int[] result = new int[a.length+b.length];
        int i, j;
        for (i = 0, j = 0; i != a.length && j != b.length; ){
            if (a[i] <= b[j]){
                result[i+j] = a[i];
                i++;
            }else {
                result[i+j] = b[j];
                j++;
            }
        }

        if (i == a.length){
            while (j != b.length)
                result[i+j] = b[j++];
        }else {
            while (i != b.length)
                result[i+j] = a[i++];
        }
        return result;
    }
}

package algorithmization.sorting;

public class Task8 {
    public static void main(String[] args) {
        int[] p = {2, 5, 2, 1, 6, 7, 3, 8};
        int[] q = {4, 2, 1, 4, 6, 6, 8, 1};

        double[] result = execute(p, q);
        viewResult(result);
    }

    private static void viewResult(double[] result) {
        for (double i : result)
            System.out.print(i+" ");
        System.out.println();
    }

    private static double[] execute(int[] p, int[] q) {
        double[] result = new double[p.length];

        boolean flag = true;
        int denominator = q[0];
        for (int i = 1; i < q.length; i++){
            denominator = denominatorExecute(denominator, q[i]);
        }
        System.out.println("знаменатель - "+denominator);

        for (int i = 0; i < result.length; i++){
            result[i] = (double) (p[i]*(denominator/q[i]))/denominator;
        }

        viewResult(result);
        while (flag){
            flag = false;
            for (int i = 0; i < result.length - 1; i++){
                if (result[i] > result[i+1]){
                    flag = true;
                    double temp = result[i];
                    result[i] = result[i+1];
                    result[i+1] = temp;
                }
            }
        }
        return result;
    }

    private static int denominatorExecute(int first, int last) {// 4 6
        int one = first;
        int two = last;
        while (last != 0){
            int temp = first;
            first = last;
            last = temp % last;

        }
        return one*two/first;
    }
}

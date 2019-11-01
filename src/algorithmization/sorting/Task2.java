package algorithmization.sorting;

public class Task2 {
    public static void main(String[] args) {
        byte[] one = {1, 4, 5, 6, 13, 16};
        byte[] two = {2, 3, 14, 17, 20, 21};

        viewResult(execute(one, two));
    }

    private static void viewResult(byte[] result) {
        for (byte i : result)
            System.out.print(i+" ");
    }

    private static byte[] execute(byte[] one, byte[] two) {
        int i = 0;
        int j = 0;
        byte[] result = new byte[one.length+two.length];

        while (i < one.length && j < two.length){
            if (one[i] < two[j]){
                result[i+j] = one[i];
                i++;
            }else{
                result[i+j] = two[j];
                j++;
            }
        }

        while (i < one.length){
            result[i+j] = one[i];
            i++;
        }

        while (j < two.length){
            result[i+j] = two[j];
            j++;
        }

        return result;
    }
}

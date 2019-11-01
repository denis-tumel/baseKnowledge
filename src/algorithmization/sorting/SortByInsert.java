package algorithmization.sorting;

public class SortByInsert {

    public static void main(String[] args) {
        int[] sequence = new int[10];
        execute(initialize(sequence));
    }


    private static int searchPlace(int[] sequence, int index) {
        int firstElement = 0;
        int lastElement = index;

        while (firstElement < lastElement){
            int mid = firstElement+(lastElement-firstElement)/2;

            if (sequence[index] < sequence[mid]){
                lastElement =  mid;
            }else
                firstElement = mid+1;
        }
        return firstElement;
    }

    private static void execute(int[] sequence) {
        for (int i = 1; i < sequence.length; i++){
            int index = searchPlace(sequence, i);
            if (index != i){
                int temp = sequence[i];
                int j;
                for (j = i - 1; j >= index; j--){
                    sequence[j+1] = sequence[j];
                }
                sequence[j+1] = temp;
            }
        }
        for (int i : sequence)
            System.out.print(i+" ");
    }

    private static int[] initialize(int[] sequence){
        for (int i = 0; i < sequence.length; i++){
            sequence[i] = (int) (Math.random() * 10);
        }
        for (int i : sequence)
            System.out.print(i+" ");
        System.out.println();
        return sequence;
    }
}

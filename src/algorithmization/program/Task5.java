package algorithmization.program;

public class Task5 {
    public static void main(String[] args) {
        int[] array = initialize();
        print(array);
        System.out.println("\nВторое по величине число - "+ execute(array));
    }

    private static int execute(int[] array){
        int maxValue = array[0];
        int twoValue = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue){
                twoValue = maxValue;
                maxValue = array[i];
            }else if(array[i] > twoValue){
                twoValue = array[i];
            }
        }
        return twoValue;
    }

    private static void print(int[] array){
        for (int i : array)
            System.out.print(i+" ");
    }

    private static int[] initialize(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 20 - 10);
        }
        return array;
    }
}

package algorithmization.sorting;

public class SortBySelection {
    public static void main(String[] args) {
        byte[] sequence = new byte[10];
        execute(initialize(sequence));
    }

    private static void execute(byte[] sequence) {
        for (int i = 0; i < sequence.length-1; i++){
            for (int j = i+1; j < sequence.length; j++){
                if (sequence[i] > sequence[j]){
                    byte temp = sequence[i];
                    sequence[i] = sequence[j];
                    sequence[j] = temp;
                }
            }
        }

        for (byte i : sequence)
            System.out.print(i+" ");
    }

    private static byte[] initialize(byte[] sequence){
        for (int i = 0; i < sequence.length; i++){
            sequence[i] = (byte) (Math.random() * 10);
        }
        for (byte i : sequence)
            System.out.print(i+" ");
        System.out.println();
        return sequence;
    }
}

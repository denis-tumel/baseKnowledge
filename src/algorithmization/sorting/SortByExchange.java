package algorithmization.sorting;

public class SortByExchange {
    public static void main(String[] args) {
        byte[] sequence = new byte[10];
        execute(initialize(sequence));
    }

    private static void execute(byte[] sequence) {
        boolean flag = true;

        while (flag){
            flag = false;
            for (byte i = 0; i < sequence.length - 1; i++){
                if (sequence[i] > sequence[i+1]){
                    byte temp = sequence[i+1];
                    sequence[i+1] = sequence[i];
                    sequence[i] = temp;
                    flag = true;
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

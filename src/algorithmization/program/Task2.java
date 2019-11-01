package algorithmization.program;

public class Task2 {
    private static int[] sequence = {3, 9, 6, 12};

    public static void main(String[] args) {
        System.out.println("NOD - "+execute());
    }

    private static int execute(){
        int i = 1;
        int result = sequence[0];
        while (i < sequence.length - 1){
            result = nod(result, sequence[i]);
            i++;
        }
        return result;
    }

    private static int nod(int a, int b){
        return b == 0 ? a : nod(b, a % b);
    }
}

package algorithmization.program;

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i += 2){
            sum += fact(i);
        }
        System.out.println(sum);
    }

    private static int fact(int i){
        if (i == 1)
            return i;
        return i * fact(--i);
    }
}

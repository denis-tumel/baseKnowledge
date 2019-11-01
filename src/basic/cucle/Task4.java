package basic.cucle;

public class Task4 {

    public static void main(String[] args) {
        Task4 task = new Task4();
        task.start();
    }

    private void start() {
        int result = 0;
        int i = 0;
        while(i <= 200){
            result *= i*i;
            i++;
        }
    }
}

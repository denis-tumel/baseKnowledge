package algorithmization.sorting;

public class SortByShell {
    public static void main(String[] args) {
        int[] mass = initializeArray();
        print(mass);
        System.out.print("\nsort - ");
        print(sortShell(mass));
    }

    private static void print(int[] mass){
        for (int i : mass){
            System.out.print(i+" ");
        }
    }

    public static int[] sortShell(int[] mass){
        int step = mass.length/2;
        while (step > 0){
            for (int i = step; i < mass.length; i++){
                int temp = mass[i];
                int j;
                for (j = i - step; j >= 0 && mass[j] > temp; j -= step){
                    mass[j + step] = mass[j];
                }
                mass[j+step] = temp;
            }
            step /= 2;
        }
        return mass;
    }

    private static int[] initializeArray() {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++){
            mass[i] = (int) (Math.random() * 10);
        }
        return mass;
    }
}

package basic.branching;

public class Task4 {
    private Integer A;
    private Integer B;
    private Integer x;
    private Integer y;
    private Integer z;

    private Task4(Integer A, Integer B){
        this.A = A;
        this.B = B;
    }
    public static void main(String[] args) {
        Task4 task = new Task4(5,3);
        task.setX(6).setY(3).setZ(2);
        task.start();
    }
    private void start() {
        if ((x < A && (y < B || z < B) || y < A && (x < B || z < B) || z < A && (y < B || x < B)))
            System.out.println("Пройдет");
        else System.out.println("Не пройдет");
    }

    private Task4 setX(Integer x) {
        this.x = x;
        return this;
    }

    private Task4 setY(Integer y) {
        this.y = y;
        return this;
    }

    private Task4 setZ(Integer z) {
        this.z = z;
        return this;
    }
}

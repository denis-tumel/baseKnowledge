package basic.linearProgram;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {// это точка входа в программу, т.е. при запуске этой программы компьютор
                                            // начинает читать с этой строчки
        Task5 task = new Task5();//
        task.start();// эти две команды запускают на выполнение код ниже
    }

    private void start() {
        System.out.print("Введите пожалуйста количество секунд: ");// выводит в консоль строчку в скобках
        Scanner sc = new Scanner(System.in);
        int valueClient = sc.nextInt();// почитай про типы данных, это очень важно, int означает что наша переменная
                                        // valueClient будет целочисленого значения т.е. например 1 2 3 4

        // byte - 8 бит, int -
        System.out.println("вы ввели число - "+valueClient);
        try {
            System.out.println("NN.MM.SS - "+ result(valueClient));// вызов функции ниже которая вернет значение в нужном
        } catch (Exception e) {
            System.err.println("value more then one day");
        }
        //формате т.е посылаем то что ввел клиент, и эта функция вернет что надо
    }

    private String result(int value) throws Exception{
        if(value > 24*60*60)
            throw new Exception();
        return value/60/60+"ч "+value/60%60+"м "+value%60+"c";

        //LocalTime time = LocalTime.ofSecondOfDay(value);
        //return time.toString();//запустим
    }

}

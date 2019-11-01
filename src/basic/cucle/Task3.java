package basic.cucle;

public class Task3 {// это класс(этот класс определяет так называемый пользовательский тип данных)
    // т.е. Когда пишем так - Task3 task(Task3 это тип данных который если посмотреть хранит значение value)
    //                                  (task это переменная с типом Task3)
    //                                   Integer value
    //                                   Task3 task - видишь сходство?
    //                                   только Integer это встроенный тип, а Task3 это уже пользовательский
    //                                   который мы создали.
    private Integer value;// это переменная обьекта(свойствоб атрибут)
    // Integer - это тип данных
    // private Integer value;
    // value - это свойство(атрибут) обьекта Task3; точнее Task3 это класс
    // а вот Task3 task = new Task3; task - это обьект класса Task3
    //
    private Task3(Integer value){
        this.value = value;
    }
    public static void main(String[] args) {
        Task3 task = new Task3(3);// Task3 - тип
        //                                   task - переменная с типом Task; этой переменной мы приравниваем значение
        //                                   тип Task3 говорит нам о том что он может хранить только значение Task3
        //                                   так же как и с простыми типами
        //                                   ты не сможешь записать число double в тип int
        //                                   так и тут ты можешь приравнять только Task3
        //                                   new специальное зарезервированое слово, которая создает нам нашу пользовательскую
        //                                   структуру данных
        task.start();
    }

    private void start() {// это метод
        int result  = 0;// это локальная т.к. определенна в методе
        for(int x = 1; x <= value; ++x){
            result += x*x;
        }
        System.out.println("Сумма квадрытов первых ста чисел - "+result);
    }
}

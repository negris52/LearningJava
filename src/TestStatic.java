public class TestStatic {
    /*3. Написать класс, реализовать в нем статический метод, статическое поле,
    обычный метод и обычное поле. Перебрать все возможные комбинации.
    Оставить закомментировать тот код, который не компилируется*/

    static String stat = "статическая переменная";
    String nonstat = "НЕстатическая переменная";

    void methodNonStatic(){
        System.out.println("Выполняется НЕстатический метод");
        String s1 = stat;
        String s2 = nonstat;
        methodStatic();
    }

    static void methodStatic(){
        System.out.println("Выполняется статический метод");
        String s1 = stat;
        //String s2 = nonstat;
        //methodNonStatic();
    }
}

    class Parent1 {
        public void method(String string) {
            System.out.println("Parent   :" + string);
        }
        public void method2(String string) {
            System.out.println("Parent   :" + string);
        }
    }
    class Child1 extends Parent1 {
        //Тип возврата несовместим с Parent1.method (String)
        @Override
        public void method(String string) {
            System.out.println("Child   :" + string);
        }
    }
    /*public class OverrideAllMethods {
        public static void main(String[] args) {
            Child1 child1 = new Child1();
            child1.method("Me");
        }
    }*/


public class Test1 implements Cloneable {

    String name;
    int age;

    public Test1(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 test1 = new Test1("Bob",17);
        Test1 test2 = new Test1("Tom", 65);
        //test2 = test1.clone();
    }
}

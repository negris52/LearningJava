public class TestConstructor {
    int a;
    String b;
    int c;

    TestConstructor(int a, String b) {
        this.a = a;
        this.b = b;
    }

    TestConstructor(int a, String b, int c) {
        this(a, b);
        this.c = c;
    }
}

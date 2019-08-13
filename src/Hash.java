public class Hash {
    public static void main(String[] args) {
        Hash hash = new Hash();

        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));//true
        System.out.println(a.hashCode() == b.hashCode());

    }

    @Override
    public int hashCode() {
        return 37 * hashCode();
    }

}

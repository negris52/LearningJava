public class TestWhile {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 15;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        for (int i = 2; i <= num / i; i++) {
            if((num % i) ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("простое число");
        } else {
            System.out.println("не простое число");
        }
    }
}

import java.util.Random;

public class TestRandom {


    public static void main(String[] args) {
        int min = 100;
        int max = 200;
        Random random = new Random();
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);
    }

}

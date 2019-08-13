public class NutsTask {
    public static void main(String[] args) {
        int count = 0, temp, temp2, temp3;
        for (int i = 100000; i > 4; i--) {
            count = 0;
            temp = i;
            while (temp % 4 == 0) {
                temp = minusStage(temp);
                count++;
                if (count > 5) {
                    temp2 = i + 1;
                    temp3 = temp + 1;
                    if (temp3 % 4 == 0) {
                        System.out.println("Подходит число " + temp2);
                    }
                    count = 0;
                }
            }
        }
    }

    private static int minusStage(int j) {
        return j = (j - 1) - j * 25 / 100;
    }
}

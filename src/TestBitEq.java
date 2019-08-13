import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class TestBitEq {
    public static void main(String[] args) {
        String s = "Ы";
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int) b[i] ^ -1 << 8) + " ");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    }
}

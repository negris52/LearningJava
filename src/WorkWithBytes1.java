import java.io.*;
import java.util.Scanner;

public class WorkWithBytes1 {
    public static void main(String[] args) {
        byte[] arr = {0, -1, 127, -128, -127, -126, -125};
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        for (int val : arr) {
            System.out.println(bais.read());
        }
    }
}
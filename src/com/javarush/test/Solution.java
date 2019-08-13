package com.javarush.test;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    String s1;

    public Solution(String s1, int a) {
        this.s1 = s1;
        this.a = a;
    }

    int a;
    public static void main(String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Я буду зарабатывать $"+s+" в час");
    }
}

//"Я буду зарабатывать $n в час".
